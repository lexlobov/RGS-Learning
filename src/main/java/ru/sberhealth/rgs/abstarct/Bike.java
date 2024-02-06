package ru.sberhealth.rgs.abstarct;

public class Bike extends Vehicle{
    @Override
    public void drive() {
        System.out.println("drive with 2 wheels");
    }

    @Override
    public void stop() {
        System.out.println("stop with handbrake");
    }
}
