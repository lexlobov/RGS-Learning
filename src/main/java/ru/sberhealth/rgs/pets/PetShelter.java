package ru.sberhealth.rgs.pets;

import java.util.List;

public class PetShelter {
    public List<Animal> pets;

    public PetShelter(List<Animal> pets) {
        this.pets = pets;
    }

    // Метод возвращает количество животных в приюте. Если животное было убрано из приюта, количество должно уменьшиться
    // Если не было, то количество должно остаться прежним
    public Integer adopt(Animal animal){
        if (pets.contains(animal)){
            pets.remove(animal);
            System.out.println(animal.name + " has been adopted");

        } else {
            System.out.println("no such pet in the shelter");
        }
        return pets.size();
    }

    // Метод возвращает индекс добавленного животного
    public Integer putNewPetInShelter(Animal animal){
        pets.add(animal);
        System.out.printf("New %s with name %s has entered our shelter%n", animal.getClass().getSimpleName(), animal.name);
        System.out.printf("There are %s pets currently in the shelter%n", pets.indexOf(animal));
        return pets.indexOf(animal);
    }
}
