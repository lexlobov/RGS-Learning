package ru.sberhealth.rgs.pets;

public class Animal {
    String name;
    Integer numberOfPaws;
    String color;

    public Animal(String name, Integer numberOfPaws) {
        this.name = name;
        this.numberOfPaws = numberOfPaws;
    }

    public String getPetName(){
        return this.name = name;
    }

    public void move(){
        System.out.println("Moves...");
    }

    public void makeSound(){
        System.out.println("Sound...");
    }
}
