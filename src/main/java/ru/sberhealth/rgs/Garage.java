package ru.sberhealth.rgs;

import java.util.ArrayList;
import java.util.List;

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

    }
}
