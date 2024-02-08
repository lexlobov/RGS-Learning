package ru.sberhealth.rgs.abstarct;

public class Car extends Vehicle{
    public Car(String model, String yearOfProduction) {
        super(model, yearOfProduction);}
    @Override
    public void drive() {
        System.out.println("drive with four wheels");
    }

    @Override
    public void stop() {
        System.out.println("stop with pedal");
    }
}
