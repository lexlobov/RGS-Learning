package ru.sberhealth.rgs.pets;

public class Cat extends Animal{

    public Cat(String name, Integer numberOfPaws) {
        super(name, numberOfPaws);
    }

    public Cat(String name){
        super(name, 4);
    }

    private String typeOfFur;

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}
