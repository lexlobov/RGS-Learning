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

//    public void adopt(Vehicle vehicle){
//        if (transport.contains(vehicle)){
//            transport.remove(vehicle);
//            System.out.println(vehicle.model + " has been adopted");
//        } else {
//            System.out.println("no such pet in the shelter");
//        }
//    }
