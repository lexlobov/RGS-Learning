package ru.sberhealth.rgs;

import ru.sberhealth.rgs.abstarct.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Boat riva = new Boat();
        Plane boeing = new Plane();
        Truck daf = new Truck();
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
    }

//    public static void main(String[] args) {
//        Cat tom = new Cat("Tom", 4);
//        Dog spike = new Dog("Spike", 4);
//        List<Animal> pets = new ArrayList<>();
//
//        pets.add(tom);
//        pets.add(spike);
//
//        for (Animal animal: pets){
//            animal.makeSound();
//        }
//
//        PetShelter shelter = new PetShelter(pets);
//        shelter.adopt(tom);
//        shelter.adopt(tom);
//    }
}
