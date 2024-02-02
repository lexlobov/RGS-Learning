package ru.sberhealth.rgs.pets;

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

    public void putNewPetInShelter(Animal animal){
        pets.add(animal);
        System.out.println(String.format("New %s with name %s has entered our shelter", animal.getClass().getSimpleName(), animal.name));
    }
}
