package ru.sberhealth.rgs.abstarct;

public class Plane extends Vehicle{

    public Plane(String model, String yearOfProduction) {
        super(model, yearOfProduction);
    }
    @Override
    protected void drive() {
        System.out.println(getModel() + " drive with wings");
    }

    @Override
    protected void stop() {
        System.out.println(getModel() + " stop by reversing the engine");
    }
}
