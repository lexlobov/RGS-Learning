package ru.sberhealth.rgs.abstarct;

public class Boat extends Vehicle{

    public Boat(String model, String yearOfProduction) {
        super(model, yearOfProduction);
    }
    @Override
    protected void drive() {
        System.out.println(getModel() + " drive with engine");
    }

    @Override
    protected void stop() {
        System.out.println(getModel() + " stop by reversing the engine");
    }
}
