package ru.sberhealth.rgs;

import ru.sberhealth.rgs.abstarct.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Boat riva = new Boat("riva", "1991");
        Plane boeing = new Plane("boeing", "1992");
        Truck daf = new Truck("daf", "1993");
        List<Vehicle> transport = new ArrayList<>();

        transport.add(riva);
        transport.add(boeing);
        transport.add(daf);

        for (Vehicle vehicle: transport){
            vehicle.drive();
        }

        Garage gr = new Garage(transport);
        gr.addVehicle(riva);
        gr.addVehicle(boeing);
        gr.addVehicle(daf);
        gr.removeVehicle(boeing);
        gr.showVehiclesInTheGarage();
    }
}