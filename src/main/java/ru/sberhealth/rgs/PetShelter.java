package ru.sberhealth.rgs;

import java.util.List;

public class PetShelter {
    public List<Animal> pets;

    public PetShelter(List<Animal> pets) {
        this.pets = pets;
    }

    public void adopt(Animal animal){
        if (pets.contains(animal)){
            pets.remove(animal);
            System.out.println(animal.name + " has been adopted");
        } else {
            System.out.println("no such pet in the shelter");
        }
    }
}
