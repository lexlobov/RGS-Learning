package ru.sberhealth.rgs;


public class Homework {

    // Создать в этом классе метод main, в котором показать работу своих классов и методов
    public static void main(String[] args) {
        Car mercedes = new Car("mercedes", 458, "legkovaya", 4);
        Car someCare = new Car();
        Car bmw = new Car("bmw", 1563, "gruzovaya", 12);
        System.out.println(mercedes.getModel() + ", " + mercedes.getHorsePower() + ", "
                + mercedes.getType() + ", " + mercedes.getNumberOfWheels());
        System.out.println(bmw.getModel() + ", " + bmw.getHorsePower() + ", "
                + bmw.getType() + ", " + bmw.getNumberOfWheels());

        someCare.setModel("Lada sedan");
        someCare.setHorsePower(12);
        someCare.setType("едет и ладно");
        someCare.setNumberOfWheels(3);

        System.out.println(someCare.getModel() + ", " + someCare.getHorsePower() + ", "
                + someCare.getType() + ", " + someCare.getNumberOfWheels());


        int[] array = {10, 8, 6, 4, 2};
        System.out.println("средняя арифметическая: " + Statistics.average(array));
        System.out.println("Соединяем строки: " + StringUtils.concatStrings("Lada", "Sedan"));
        System.out.println("сумма элементов: " + Statistics.sum(array));
    }

    // Создать класс с описанием автомобиля. У него должны быть поля для обозначения модели, количества лошадиных сил,
    // типа (легковой или грузовой), количества колес. Создать конструктор по полям модель и количество лошадиных сил, создать геттеры и сеттеры для всех полей.
    // Сделать так, чтобы доступ к полям был возможен только внутри класса. Создать два экземпляра класса, установить им тип и вывести на экран значения их полей.
}
class Car {
        private String model;
        private int horsePower;
        private String type;
        private int numberOfWheels;

        protected Car(String model, int horsePower, String type,int numberOfWheels){
                this.model = model;
                this.horsePower = horsePower;
                this.type = type;
                this.numberOfWheels = numberOfWheels;
        }

    protected Car(){}

    protected String getModel() {
            return model;
        }

    protected int getHorsePower() {
            return horsePower;
        }

    protected String getType() {
            return type;
        }

    protected int getNumberOfWheels() {
            return numberOfWheels;
        }

    protected void setModel(String model) {
            this.model = model;
    }

    protected void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
    }

    protected void setType(String type) {
            this.type = type;
    }

    protected void setNumberOfWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }

    }
    // Создать класс, который будет хранить в себе статические методы: метод для расчета среднего арифметического элементов целочисленного массива,
    // метод для склеивания любого количества строк в одну, метод для расчета суммы всех входящих в массив элементов.


class Statistics {
    public static double average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}

class StringUtils {
    public static String concatStrings(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            result.append(s);
        }
        return result.toString();
    }
}