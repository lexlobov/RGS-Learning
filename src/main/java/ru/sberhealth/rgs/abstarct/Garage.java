package ru.sberhealth.rgs.abstarct;

import java.time.LocalDate;
import java.util.*;

public class Garage {
    public List<Vehicle> vehicles;

    public Garage(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    public void park(Vehicle vehicle){
        vehicle.stop();
        vehicles.add(vehicle);
    }

    public void unPark(Vehicle vehicle) {
        if (vehicles.contains(vehicle)) {
            vehicles.remove(vehicle);
            vehicle.drive();
        } else {
            System.out.println("no such vehicle in the garage");
        }
    }
    public void showVehiclesInTheGarage(){
        System.out.println("Today is " + LocalDate.now() + " Vehicles in the garage:");
        Map<Class<? extends Vehicle>, Integer> vehicleCount = new HashMap<>();
        for (Vehicle vehicle : vehicles){
            Class<? extends Vehicle> vehicleClass = vehicle.getClass();
            int count = vehicleCount.getOrDefault(vehicleClass, 0);
            vehicleCount.put(vehicleClass, count + 1);
        }
        for (Map.Entry<Class<? extends Vehicle>, Integer> entry : vehicleCount.entrySet()){
            System.out.println(entry.getKey().getSimpleName() + " " + entry.getValue() + ";");
        }
    }

}
