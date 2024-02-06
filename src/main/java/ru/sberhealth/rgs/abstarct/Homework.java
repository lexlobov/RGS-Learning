package ru.sberhealth.rgs.abstarct;

import java.util.ArrayList;
import java.util.List;

public class Homework {
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
    // Написать классы Truck, Boat и Plane, которые будут являться наследниками класса Vehicle и реализовывать
    // его абстрактные методы. Написать класс Garage, который будет хранить в себе список транспортных средств.
    // В классе Garage сделать метод, который будет добавлять новое транспортное средство в гараж. Также написать
    // метод, который будет выводить транспортное средство из гаража, используя метод для движения этого транспортного
    // средства.
    // Сделать метод showVehiclesInTheGarage в классе Garage, который будет выводить информацию о том, сколько каких транспортных средств
    // находится в гараже на данный момент. Вывод должен быть в виде:
    /*
    Today is 01.01.2024. Vehicles in the garage:
    Bike - 1;
    Car - 2;
    Truck - 0;
    Boat - 2;
    Plane - 1;
     */
    // Для того чтобы вывести на экран список транспортных средств, использовать метод String.format(), изучить, как им пользоваться.
    // Получить имя класса объекта можно, используя на объекте метод getClass().getSimpleName()
}
