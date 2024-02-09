import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


import org.junit.jupiter.api.*;
import ru.sberhealth.rgs.pets.Animal;
import ru.sberhealth.rgs.pets.Cat;
import ru.sberhealth.rgs.pets.Dog;
import ru.sberhealth.rgs.pets.PetShelter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class PetShelterTests {


    private  List<Animal> pets;
    private  PetShelter petShelter;



    @BeforeEach
    public void setUp(){
    pets = new ArrayList<>();
    petShelter = new PetShelter(pets);

    }

    @AfterEach
    public void cleanUp(){
        pets.clear();
    }

    @Test
    @DisplayName("При поступлении нового животного в питомник оно должно отображаться в списке")
    public void newPetTest(){
        Animal tom = new Cat("Tom", 4);
        petShelter.putNewPetInShelter(tom);
        assertThat("Pet shelter should contain Tom", petShelter.pets.contains(tom));
    }

    @Test
    @DisplayName("При забирании животного из питомника оно больше не должно значиться в списке")
    public void adoptionTest(){
        Animal tom = new Cat("Tom", 4);
        petShelter.putNewPetInShelter(tom);
        petShelter.adopt(tom);
        assertThat("Pet shelter should not contain Tom after adoption", !petShelter.pets.contains(tom));
    }


    @Test
    @DisplayName("Проверка, что если всех животных забрали, то список пуст")
    public void nullPetInsideShelterTest(){
        Animal matt = new Dog("matt", 4);

        petShelter.putNewPetInShelter(matt);
        petShelter.adopt(matt);
       assertThat(pets, hasSize(0));
    }

    @Test
    @DisplayName("Проверка, что по индексу возвращаемому индексу расположено именно таш животное")
    public void getExactPetInsideShelterTest(){
        Animal tom = new Cat("Tom", 4);
        Animal matt = new Dog("matt", 4);

        int mattIndex = petShelter.putNewPetInShelter(matt);
        petShelter.putNewPetInShelter(tom);

        assertThat(pets.get(mattIndex).getPetName(), equalTo("matt"));
    }

    @Test
    @DisplayName("Проверка, что собака в питомнике еще жива и лает")
    public void getBarkFromDogInTheShelterTest(){

        Animal cat = new Dog("cat", 4);
        petShelter.putNewPetInShelter(cat);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        cat.makeSound();

        assertThat(outputStream.toString().trim(), equalTo("Bark"));
    }

    @Test
    @DisplayName("Проверка, что кошка в питомнике еще жива и мяукает")
    public void getMeowFromCatInTheShelterTest(){

        Animal dog = new Cat("dog", 4);
        petShelter.putNewPetInShelter(dog);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        dog.makeSound();

        assertThat(outputStream.toString().trim(), equalTo("Meow"));
    }

    @Test
    @DisplayName("Проверка, текста ошибки, если приютить несуществующую зверушку")
    public void adoptNoSuchAnimalInsideShelterTest(){

        Animal dog = new Cat("cat", 4);
        Animal cat = new Dog("dog", 4);

        petShelter.putNewPetInShelter(dog);


        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        petShelter.adopt(cat);

        assertThat(pets, hasSize(1));
        assertThat(outputStream.toString().trim(), equalTo("no such pet in the shelter"));
    }

    @Test
    @DisplayName("Проверка, текста ошибки, если приютить новую зверушку")
    public void adoptNewAnimalInsideShelterTest(){

        Animal dog = new Cat("cat", 4);

        petShelter.putNewPetInShelter(dog);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        petShelter.adopt(dog);

        assertThat(outputStream.toString().trim(), equalTo(dog.getPetName() + " has been adopted"));
    }

    @Test
    @DisplayName("Проверка, что при адоптации возвращается корректный размер приюта")
    public void adoptCheckShelterSizeTest(){

        Animal cat = new Dog("cat", 4);
        Animal dog = new Cat("dog", 4);

        petShelter.putNewPetInShelter(dog);
        petShelter.putNewPetInShelter(cat);
        int ShelterSize = petShelter.adopt(dog);

        assertThat(ShelterSize, equalTo(1));
    }

    @Test
    @DisplayName("Проверка корректности счета в тексте с кол-вом животных в приюте")
    public void putNewPetInTheShelterNumOfPetsTest(){

        Animal cat = new Dog("cat", 4);
        Animal dog = new Cat("dog", 4);
        Animal petukh = new Cat("kurochka", 2);

        petShelter.putNewPetInShelter(dog);
        petShelter.putNewPetInShelter(cat);


        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        petShelter.putNewPetInShelter(petukh);

        assertThat(outputStream.toString().trim(), containsString("New " + petukh.getClass().getSimpleName() + " with name " + petukh.getPetName() + " has entered our shelter " +
                "There are " + pets.size() + " pets currently in the shelter"));
    }

}
