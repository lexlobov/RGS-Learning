package ru.sberhealth.rgs.abstarct;

public class Truck extends Vehicle{

    public Truck(String model, String yearOfProduction) {
        super(model, yearOfProduction);
    }
    @Override
    protected void drive() {
        System.out.println(getModel() + " drive with twelve wheels");
    }

    @Override
    protected void stop() {
        System.out.println(getModel() + " stop with pedal");
    }
}