package ru.sberhealth.rgs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat tom = new Cat("Tom", 4);
        Dog spike = new Dog("Spike", 4);
        List<Animal> pets = new ArrayList<>();

        pets.add(tom);
        pets.add(spike);

        for (Animal animal: pets){
            animal.makeSound();
        }

        PetShelter shelter = new PetShelter(pets);
        shelter.adopt(tom);
        shelter.adopt(tom);
    }
}
