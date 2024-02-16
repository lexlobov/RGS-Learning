package ru.sberhealth.rgs;

public class Truck extends Vehicle {
    @Override
    public void move() {
        System.out.println("Truck must carry cargo");
    }
}
