package ru.sberhealth.rgs.abstarct;

public class Truck extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
    @Override
    public void stop() {
        System.out.println("Truck is stop");
    }
}