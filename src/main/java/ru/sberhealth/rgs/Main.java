package ru.sberhealth.rgs;

import ru.sberhealth.rgs.Garage;
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.addVehicle("Boat", 1); // Добавляет 3 автомобиля в гараж
        garage.addVehicle("Truck", 3); // Добавляет 3 автомобиля в гараж
        garage.addVehicle("Plane", 4); // Добавляет 3 автомобиля в гараж
        garage.removeVehicle("Plane", 2); // Добавляет 2 мотоцикла в гараж
        garage.showVehiclesInTheGarage(); // Выводит информацию о наличии транспортных средств в гараже
    }
}