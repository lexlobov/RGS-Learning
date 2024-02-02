package ru.sberhealth.rgs.abstarct;

public class Bike extends Vehicle{

    public Bike(String model, String yearOfProduction) {
        super(model, yearOfProduction);
    }

    @Override
    protected void drive() {
        System.out.println(getModel() + " drive with 2 wheels");
    }

    @Override
    protected void stop() {
        System.out.println(getModel() + " stop with handbrake");
    }

}
