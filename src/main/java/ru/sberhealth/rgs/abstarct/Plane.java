package ru.sberhealth.rgs.abstarct;

public class Plane extends Vehicle {
    public Plane(String model, String yearOfProduction) {
        super(model, yearOfProduction);}
    @Override
    public void drive() {
        System.out.println("Plane is flying");
    }
    @Override
    public void stop() {
        System.out.println("Plane is stop");
    }
}