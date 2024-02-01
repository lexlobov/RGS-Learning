package ru.sberhealth.rgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garage {
    List<Vehicle> garage = new ArrayList<>();


    public void addNewVehicleToGarage(Vehicle vehicle){
        garage.add(vehicle);
    }

    public void drive(Vehicle vehicle) {
        vehicle.drive();
    }

    public void stop(Vehicle vehicle) {
        vehicle.stop();
    }

    public void showVehiclesInTheGarage(){

        System.out.println("Today is 01.01.2024. Vehicles in the garage:");

        // Создаем словарь vehicleCount где ключами являются классы транспортных средств,
        // а значениями Integer - их кол-во для каждого класса
        Map<Class<? extends Vehicle>, Integer> vehicleCount = new HashMap<>();


        for (Vehicle vehicle : garage){
            Class<? extends Vehicle> vehicleClass = vehicle.getClass();
            int count = vehicleCount.getOrDefault(vehicleClass, 0);
            vehicleCount.put(vehicleClass, count + 1);
        }

        for (Map.Entry<Class<? extends Vehicle>, Integer> entry : vehicleCount.entrySet()){
            System.out.println(entry.getKey().getSimpleName() + " " + entry.getValue() + ";");
        }

        garage.getClass().getSimpleName();
    }
}
