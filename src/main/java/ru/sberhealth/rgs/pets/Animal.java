package ru.sberhealth.rgs.pets;

public class Animal {
    String name;
    Integer numberOfPaws;
    String color;

    public Animal(String name, Integer numberOfPaws) {
        this.name = name;
        this.numberOfPaws = numberOfPaws;
    }

    protected void move(){
        System.out.println("Moves...");
    }

    protected void makeSound(){
        System.out.println("Sound...");
    }
}
