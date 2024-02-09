import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.sberhealth.rgs.pets.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;

public class PetShelterTests {

    private PetShelter petShelter;
    private List<Animal> pets;

    @BeforeEach
    public void setUp(){
        pets = new ArrayList<>();
        petShelter = new PetShelter(pets);
    }

    @AfterEach
    public void cleanUp(){
        pets.clear();
        assertTrue(pets.isEmpty());
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
        Animal simon = new Dog("simon", 4);

        petShelter.putNewPetInShelter(simon);
        petShelter.adopt(simon);
        assertThat(pets, hasSize(0));
    }



    @Test
    @DisplayName("Проверка количсетсва животных в приюте, после адоптации")
    public void adoptCheckShelterSizeTest(){

        Animal cat = new Dog("cat", 4);
        Animal dog = new Cat("dog", 4);

        petShelter.putNewPetInShelter(dog);
        petShelter.putNewPetInShelter(cat);
        int shelterSize = petShelter.adopt(dog);

        assertThat(shelterSize, equalTo(1));
    }

    @Test
    @DisplayName("Проверка, что под индексом определенное животное")
    public void animalIndexTest(){

        Animal cat = new Dog("cat", 4);
        Animal dog = new Cat("dog", 4);
        Animal doggy = new Cat("dog", 4);

        petShelter.putNewPetInShelter(dog);
        petShelter.putNewPetInShelter(cat);
        petShelter.putNewPetInShelter(doggy);

        assertThat(pets.get(pets.size() - 1), equalTo(doggy));
    }

    @Test
    @DisplayName("При адаптации животного не из приюта, количество животных в приюте не меняется")
    public void adoptFromEmptyShelterTest(){

        Animal cat = new Cat("cat", 4);
        Animal cat1 = new Cat("cat", 4);

        petShelter.putNewPetInShelter(cat);

        assertThat(petShelter.adopt(cat1), is(pets.size()));
    }
}


