package ru.sberhealth.rgs;

public abstract class Vehicle {
    protected String model;
    protected String yearOfProduction;

    public Vehicle(String model, String yearOfProduction){
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    protected abstract void drive();
    protected abstract void stop();
}
