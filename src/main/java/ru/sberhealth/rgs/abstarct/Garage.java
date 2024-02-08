package ru.sberhealth.rgs.abstarct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garage {
    public List<Vehicle> transport;

    public Garage(List<Vehicle> transport) {
        this.transport = transport;
    }


    public void addVehicle(Vehicle vehicle) {
        transport.add(vehicle);
        vehicle.stop();
    }
    public void removeVehicle(Vehicle vehicle) {
            transport.remove(vehicle);
            vehicle.drive();
    }

    public void showVehiclesInTheGarage(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Today is " + formattedDate + ". Vehicles in the garage:");
        Map<Class<? extends Vehicle>, Integer> vehicleCount = new HashMap<>();
        for (Vehicle transport : transport){
            Class<? extends Vehicle> vehicleClass = transport.getClass();
            int count = vehicleCount.getOrDefault(vehicleClass, 0);
            vehicleCount.put(vehicleClass, count + 1);
        }
        for (Map.Entry<Class<? extends Vehicle>, Integer> entry : vehicleCount.entrySet()){
            System.out.println(entry.getKey().getSimpleName() + " - " + entry.getValue() + ";");
        }
    }
}

//    String[] vehicles = {};
//    Map<Class<? extends Vehicle>, Integer> vehicleCount = new HashMap<>();
//                for (Vehicle transport : transport){
//                        Class<? extends Vehicle> vehicleClass = transport.getClass();
//        int count = vehicleCount.getOrDefault(vehicleClass, 0);
//        vehicleCount.put(vehicleClass, count + 1);
//        }
//        for (Map.Entry<Class<? extends Vehicle>, Integer> entry : vehicleCount.entrySet()){
//        System.out.println(String.format("%s", vehicles)) + " - " + entry.getValue() + ";");
//        }
//}
//}