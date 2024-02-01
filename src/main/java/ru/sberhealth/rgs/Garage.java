package ru.sberhealth.rgs;

import java.sql.Time;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
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

        System.out.println("Today is " + LocalDate.now() + " Vehicles in the garage:");

        // Создаем словарь vehicleCount где ключами являются классы транспортных средств,
        // а значениями Integer - их кол-во для каждого класса
        Map<Class<? extends Vehicle>, Integer> vehicleCount = new HashMap<>();


        for (Vehicle vehicle : garage){
            // Для каждого ТС получаем его класс
            Class<? extends Vehicle> vehicleClass = vehicle.getClass();
            // Проверяем, есть ли запись в словаре. Если записи нет, то возвращаем дефолт (0)
            int count = vehicleCount.getOrDefault(vehicleClass, 0);
            // Если есть, то int count = кол-во, что уже есть в словаре + 1
            // То есть если запись в словаре есть, то int count = n + 1 Если нет, то 0 вернем дефолтное
            // получившееся значение мы записываем в словарь vehicleCount
            vehicleCount.put(vehicleClass, count + 1);
        }

        /* Используем for each чтобы пройти по справочнику vehicleCount
        // vehicleCount.entrySet() - возвращает набор элементов как множество key: value
        // Map.Entry<Class<? extends Vehicle>, Integer> - указывает на тип элементов множества
        (ключ = класс-подтип Vehicle, значение Integer будет содержать в себе результат наших вычислений для
        соответствующих классов)
        entry - переменная, которая содержит в себе значения текущего элемента vehicleCount.entrySet()
        Цикл выполняется до тех пор пока не будут выведены все элементы vehicleCount
        В sout мы используем getKey().getSimpleName() для получения и вывода имени класса, entry.getValue - для получения
        и вывода значения Integer из vehicleCount.entrySet()
        */
        for (Map.Entry<Class<? extends Vehicle>, Integer> entry : vehicleCount.entrySet()){
            System.out.println(entry.getKey().getSimpleName() + " " + entry.getValue() + ";");
        }

        garage.getClass().getSimpleName();
    }
}
