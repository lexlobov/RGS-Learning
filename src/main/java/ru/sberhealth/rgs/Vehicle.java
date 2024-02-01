package ru.sberhealth.rgs;

public abstract class Vehicle {
    protected String model;
    protected String yearOfProduction;

    protected abstract void drive(String vehicle);
    protected abstract void stop(String vehicle);
}
