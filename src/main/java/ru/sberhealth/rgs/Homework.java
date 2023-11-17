package ru.sberhealth.rgs;

public class Homework {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 200, "легковой", 4);
        Car car2 = new Car("Volvo", 250, "грузовой", 6);

        System.out.println("Car 1: " + car1.getModel() + ", " + car1.getHorsepower() + " hp, " + car1.getType() + ", " + car1.getNumberOfWheels() + " wheels");
        System.out.println("Car 2: " + car2.getModel() + ", " + car2.getHorsepower() + " hp, " + car2.getType() + ", " + car2.getNumberOfWheels() + " wheels");

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Average: " + Statistics.calculateAverage(array));
        System.out.println("Concatenated String: " + StringUtils.concatenateStrings("Hello", "World"));
        System.out.println("Sum of array elements: " + Statistics.calculateSum(array));
    }
}

class Car {
    private String model;
    private int horsepower;
    private String type;
    private int numberOfWheels;

    public Car(String model, int horsepower, String type, int numberOfWheels) {
        this.model = model;
        this.horsepower = horsepower;
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}

class Statistics {
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}

class StringUtils {
    public static String concatenateStrings(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            result.append(s);
        }
        return result.toString();
    }
}


// Создать в этом классе метод main, в котором показать работу своих классов и методов

// Создать класс с описанием автомобиля. У него должны быть поля для обозначения модели, количества лошадиных сил,
// типа (легковой или грузовой), количества колес. Создать конструктор по полям модель и количество лошадиных сил, создать геттеры и сеттеры для всех полей.
// Сделать так, чтобы доступ к полям был возможен только внутри класса. Создать два экземпляра класса, установить им тип и вывести на экран значения их полей.

// Создать класс, который будет хранить в себе статические методы: метод для расчета среднего арифметического элементов целочисленного массива,
// метод для склеивания любого количества строк в одну, метод для расчета суммы всех входящих в массив элементов.