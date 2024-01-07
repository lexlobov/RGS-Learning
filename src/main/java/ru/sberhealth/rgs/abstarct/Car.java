package ru.sberhealth.rgs.abstarct;

public class Car extends Vehicle{
    @Override
    protected void drive() {
        System.out.println("drive with four wheels");
    }

    @Override
    protected void stop() {
        System.out.println("stop with pedal");
    }
}
