package ru.sberhealth.rgs;

public class Dog extends Animal{
    public Dog(String name, Integer numberOfPaws) {
        super(name, numberOfPaws);
    }

    private void sit(){
        System.out.println(name + " sits down");
    }

    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}
