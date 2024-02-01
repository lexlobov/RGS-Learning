package ru.sberhealth.rgs;

public class Truck extends Vehicle{


    public Truck(String model, String yearOfProduction) {
        super(model, yearOfProduction);
    }

    @Override
    protected void drive() {
        System.out.println("Drive with 12 steel wheels");
    }

    @Override
    protected void stop() {
        System.out.println("Stop to pee with 12 steel wheels");
    }
}
