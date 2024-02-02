package ru.sberhealth.rgs;

import ru.sberhealth.rgs.abstarct.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike("Baikal", "1983");
        Vehicle car = new Car("Jiguli", "1999");
        Vehicle truck = new Truck("BMW", "2009");
        Vehicle boat = new Boat("Suzuki", "2009");
        Vehicle boat1 = new Boat("Yamaha", "2023");
        Vehicle plane = new Plane("Aerobus", "1883");

        List<Vehicle> vehicles = new ArrayList<>();


        Garage garage = new Garage(vehicles);

        garage.park(boat);
        garage.park(boat1);
        garage.park(car);
        garage.park(truck);
        garage.park(plane);
        garage.park(bike);
        garage.showVehiclesInTheGarage();

        garage.unPark(truck);
        garage.showVehiclesInTheGarage();
        garage.unPark(boat1);
        garage.showVehiclesInTheGarage();
    }
}
