import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;
import ru.sberhealth.rgs.request.CreateUserRequest;
import ru.sberhealth.rgs.response.CreateUserResponse;

import static org.apache.http.HttpStatus.SC_CREATED;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ReqresCreateUserTests {

    private final String baseUri = "https://reqres.in";
    private final String createUserUri = "/api/users";

    @Test
    public void createUserTest(){
        ValidatableResponse response = createUser("John", "driver");
        response.statusCode(SC_CREATED);
    }

    @Test
    public void createUser2Test(){
        CreateUserRequest body = new CreateUserRequest();
        body.setName("Claire");
        body.setJob("QA Tester");
        ValidatableResponse response = createUserWithBody(body);
        response.statusCode(SC_CREATED);
        CreateUserResponse createUserResponse = response.extract().body().as(CreateUserResponse.class);

        assertThat("Names of created users should be equal", createUserResponse.getName(), equalTo(body.getName()));
    }


    public ValidatableResponse createUser(String name, String job){
        return RestAssured.given()
                .when()
                .log().method().log().headers().log().body()
                .baseUri(baseUri)
                .contentType(ContentType.JSON)
                .body(String.format(
                        """
                                {
                                    "name": "%s",
                                    "job": "%s"
                                }
                                """, name, job)
                )
                .post(createUserUri)
                .then()
                .log().all();
    }

    public ValidatableResponse createUserWithBody(CreateUserRequest body){
        return RestAssured.given()
                .when()
                .log().method().log().headers().log().body()
                .baseUri(baseUri)
                .contentType(ContentType.JSON)
                .body(body)
                .post(createUserUri)
                .then()
                .log().all();
    }
}
