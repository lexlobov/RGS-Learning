package ru.sberhealth.rgs.abstarct;

public class Boat extends Vehicle {
    public Boat(String model, String yearOfProduction) {
        super(model, yearOfProduction);
    }
    @Override
    public void drive() {
        System.out.println("Boat is sailing");
    }
    @Override
    public void stop() {
        System.out.println("Boat is stop");
    }
}