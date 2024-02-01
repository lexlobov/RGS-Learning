package ru.sberhealth.rgs;

public class Plane extends Vehicle{

    private final String plane1 = "Antonov An-2";

    private final String plane2 = "IL-76";

    @Override
    protected void drive(String vehicle) {
        System.out.println("fly without any wheels. It's a plane ept");
    }

    @Override
    protected void stop(String vehicle) {
        System.out.println("Landing with couple of wheels. Soft Landing");
    }
}
