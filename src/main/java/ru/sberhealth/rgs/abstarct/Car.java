package ru.sberhealth.rgs.abstarct;

public class Car extends Vehicle{

    public Car(String model, String yearOfProduction) {
        super(model, yearOfProduction);
    }
    @Override
    protected void drive() {
        System.out.println(getModel() + " drive with four wheels");
    }

    @Override
    protected void stop() {
        System.out.println(getModel() + " stop with pedal");
    }
}