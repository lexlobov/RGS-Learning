import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.sberhealth.rgs.response.GetUsersResponse;
import ru.sberhealth.rgs.response.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ReqresGetTest {


    @Test
    @DisplayName("https://reqres.in/api/users Получить список пользователей")
    public void getListOfUsersTest(){
        ValidatableResponse response = RestAssured.get("https://reqres.in/api/users?page=1").then();
        System.out.println(response.extract().body().asString());
        response.statusCode(200);
    }


    @Test
    @DisplayName("https://reqres.in/api/users Получить список пользователей")
    public void getUsers2Test(){
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("page", 1);
        ValidatableResponse response = getUsersList(queryParams);

        assertThat("Response status code should be 200", response.extract().statusCode(),  equalTo(SC_OK));
    }

    @Test
    @DisplayName("Получить пользователей и вывести на экран их имена")
    public void getUsersAndLogTheirNamesTest(){
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("page", 1);
        ValidatableResponse response = getUsersList(queryParams);
        List<User> users = response.extract().body().as(GetUsersResponse.class).getData();

        for (User user: users) {
            System.out.println(user.getFirst_name());
            assertThat("Every user should have a name", user.getFirst_name(), Matchers.notNullValue());
        }
    }

    @Test
    public void getUsers3Test(){
        String url = "https://reqres.in/api/users";
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("page", 1);
        ValidatableResponse response = getSomeUrl(url, queryParams);
        response.statusCode(SC_OK);
    }

    public ValidatableResponse getUsersList(Map<String, Object> queryParams){
        return RestAssured.given()
                .when()
                .log().method().log().headers().log().body()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .queryParams(queryParams)
                .header("SomeHeader", "ValueOfSomeHeader")
                .get("/api/users")
                .then().log().all();
    }

    public ValidatableResponse getSomeUrl(String url, Map<String, Object> queryParams){
        return RestAssured.given()
                .when()
                .log().method().log().headers().log().body()
                .contentType(ContentType.JSON)
                .queryParams(queryParams)
                .get(url)
                .then()
                .log().all();
    }
}
