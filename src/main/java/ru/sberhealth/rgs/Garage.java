package ru.sberhealth.rgs;

import java.util.ArrayList;
import java.util.List;

public class Garage extends Vehicle{
    List<String> garage = new ArrayList<>();

    public void addNewVehicleToGarage(String vehicle){
        garage.add(vehicle);
    }

    @Override
    protected void drive(String vehicle) {
        garage.remove(vehicle);
    }

    @Override
    protected void stop(String vehicle) {

    }

    public void showVehiclesInTheGarage(){

    }



}
