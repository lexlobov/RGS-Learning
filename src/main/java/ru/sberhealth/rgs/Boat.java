package ru.sberhealth.rgs;

public class Boat extends Vehicle{

    public Boat(String model, String yearOfProduction) {
        super(model, yearOfProduction);
    }

    @Override
    protected void drive() {
        System.out.println("Sailing on oars like a poor pirates of the Barbarian sea");
    }

    @Override
    protected void stop() {
        System.out.println("Ship oars! Easy all!");
    }
}
