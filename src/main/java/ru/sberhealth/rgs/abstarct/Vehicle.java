package ru.sberhealth.rgs.abstarct;

public abstract class Vehicle {
    protected String model;
    protected String yearOfProduction;

    protected abstract void drive();
    protected abstract void stop();
}
