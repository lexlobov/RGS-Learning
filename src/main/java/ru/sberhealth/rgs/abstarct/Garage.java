package ru.sberhealth.rgs.abstarct;

import java.util.List;

public class Garage {
    public List<Vehicle> transport;

    public Garage(List<Vehicle> transport) {
        this.transport = transport;
    }

    public void addVehicle(Vehicle vehicle) {
        transport.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        transport.remove(vehicle);
        vehicle.drive();
    }
}
