package ru.sberhealth.rgs;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<String, Integer> vehicles;

    public Garage() {
        vehicles = new HashMap<>();
    }

    public void addVehicle(String vehicleType, int quantity) {
        vehicles.put(vehicleType, vehicles.getOrDefault(vehicleType, 0) + quantity);
        System.out.println(quantity + " " + vehicleType + " added to the garage.");
    }

    public void removeVehicle(String vehicleType, int quantity) {
        if (vehicles.containsKey(vehicleType)) {
            int currentQuantity = vehicles.get(vehicleType);
            if (currentQuantity >= quantity) {
                vehicles.put(vehicleType, currentQuantity - quantity);
                System.out.println(quantity + " " + vehicleType + " removed from the garage.");
            } else {
                System.out.println("Not enough " + vehicleType + " in the garage");
            }
        } else {
            System.out.println("No such vehicle type in the garage");
        }
    }

    public void showVehiclesInTheGarage() {
        LocalDate currentDate = LocalDate.now();

        System.out.println(String.format("Today is %s. Vehicles in the garage:", currentDate));
        for (Map.Entry<String, Integer> entry : vehicles.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + ";");
        }
    }
}