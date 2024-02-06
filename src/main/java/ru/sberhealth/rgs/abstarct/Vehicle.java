package ru.sberhealth.rgs.abstarct;

public abstract class Vehicle {
    protected String model;
    protected String yearOfProduction;

    public abstract void drive();
    public abstract void stop();
}
