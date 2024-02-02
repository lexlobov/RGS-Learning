package ru.sberhealth.rgs;

public class Plane extends Vehicle{

    private final String model = "Antonov An-2";

    private final String plane2 = "IL-76";

    public Plane(String model, String yearOfProduction) {
        super(model, yearOfProduction);
    }


    @Override
    protected void drive() {
        System.out.println("fly without any wheels. It's a plane ept");
    }

    @Override
    protected void stop() {
        System.out.println("Landing with couple of wheels. Soft Landing");
    }
}
