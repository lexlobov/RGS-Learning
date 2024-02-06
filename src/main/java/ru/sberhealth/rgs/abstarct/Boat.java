package ru.sberhealth.rgs.abstarct;

public class Boat extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Boat is sailing");
    }
    @Override
    public void stop() {
        System.out.println("Boat is stop");
    }
}