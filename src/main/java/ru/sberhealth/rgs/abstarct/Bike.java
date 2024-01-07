package ru.sberhealth.rgs.abstarct;

public class Bike extends Vehicle{
    @Override
    protected void drive() {
        System.out.println("drive with 2 wheels");
    }

    @Override
    protected void stop() {
        System.out.println("stop with handbrake");
    }
}
