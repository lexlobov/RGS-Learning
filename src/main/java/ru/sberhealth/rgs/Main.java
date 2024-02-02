package ru.sberhealth.rgs;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Boat boat = new Boat("Sobol", "2015");
        Boat boat2 = new Boat("Drakkar-2", "613");
        Truck truck = new Truck("MAZ", "2022");
        Truck truck2 = new Truck("KAMAZ T1", "1988");
        Plane plane = new Plane("TU-2", "1940");
        Plane plane2 = new Plane("SU-24", "1977");

        garage.addNewVehicleToGarage(boat);
        garage.addNewVehicleToGarage(boat2);
        garage.addNewVehicleToGarage(truck);
        garage.addNewVehicleToGarage(truck2);
        garage.addNewVehicleToGarage(plane);
        garage.addNewVehicleToGarage(plane2);

        garage.drive(boat2);
        garage.drive(truck2);
        garage.stop(truck2);

        garage.showVehiclesInTheGarage();
    }

}

/*
package ru.sberhealth.rgs.abstarct;

public class Homework {

    // Написать классы Truck, Boat и Plane, которые будут являться наследниками класса Vehicle и реализовывать
    // его абстрактные методы.
    Написать класс Garage, который будет хранить в себе список транспортных средств.

    // В классе Garage сделать метод, который будет добавлять новое транспортное средство в гараж. Также написать
    // метод, который будет выводить транспортное средство из гаража, используя метод для движения этого транспортного
    // средства.
    // Сделать метод showVehiclesInTheGarage в классе Garage, который будет выводить информацию о том, сколько каких транспортных средств
    // находится в гараже на данный момент. Вывод должен быть в виде:
    */
/*
    Today is 01.01.2024. Vehicles in the garage:
    Bike - 1;
    Car - 2;
    Truck - 0;
    Boat - 2;
    Plane - 1;
     *//*

    // Для того чтобы вывести на экран список транспортных средств, использовать метод String.format(), изучить, как им пользоваться.
    // Получить имя класса объекта можно, используя на объекте метод getClass().getSimpleName()
}*/
