package ru.sberhealth.rgs.abstarct;

import lombok.Getter;

public abstract class Vehicle {

    protected String model;
    protected String yearOfProduction;

    public Vehicle(String model, String yearOfProduction){
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    protected abstract void drive();
    protected abstract void stop();

}