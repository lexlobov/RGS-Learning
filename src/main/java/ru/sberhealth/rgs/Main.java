package ru.sberhealth.rgs;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Car passengerCar = new Car("Opel", 115);
        Car freightCar = new Car("Ford", 150);

        passengerCar.setType("Легковой");
        freightCar.setType("Грузовой");

        System.out.println("Модель автомобиля 1: " + passengerCar.getModel());
        System.out.println("Лошадиные силы автомобиля 1: " + passengerCar.getHorsepower());
        System.out.println("Тип автомобиля 1: " + passengerCar.getType());

        System.out.println("Модель автомобиля 2: " + freightCar.getModel());
        System.out.println("Лошадиные силы автомобиля 2: " + freightCar.getHorsepower());
        System.out.println("Тип автомобиля 2: " + freightCar.getType());

//        Double calcAver = Utils.calculateAverage(1,2,3);
        String concStr = Utils.concatenateStrings("При", "вет");
//        Integer calcSum = Utils.calculateSum(1,2,3);
//        System.out.println(calcAver);
        System.out.println(concStr);
//        System.out.println(calcSum);
    }
}
// Создать в этом классе метод main, в котором показать работу своих классов и методов

// Создать класс с описанием автомобиля. У него должны быть поля для обозначения модели, количества лошадиных сил,
// типа (легковой или грузовой), количества колес. Создать конструктор по полям модель и количество лошадиных сил, создать геттеры и сеттеры для всех полей.
// Сделать так, чтобы доступ к полям был возможен только внутри класса. Создать два экземпляра класса, установить им тип и вывести на экран значения их полей.

// Создать класс, который будет хранить в себе статические методы: метод для расчета среднего арифметического элементов целочисленного массива,
// метод для склеивания любого количества строк в одну, метод для расчета суммы всех входящих в массив элементов.
