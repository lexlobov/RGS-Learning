package ru.sberhealth.rgs;

public class Cat extends Animal{

    public Cat(String name, Integer numberOfPaws) {
        super(name, numberOfPaws);
    }

    private String typeOfFur;

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}
