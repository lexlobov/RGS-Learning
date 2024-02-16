package ru.sberhealth.rgs;

import ru.sberhealth.rgs.Garage;
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.addVehicle("Boat", 1);
        garage.addVehicle("Truck", 3);
        garage.addVehicle("Plane", 4);
        garage.removeVehicle("Plane", 2);
        garage.showVehiclesInTheGarage();
    }
}