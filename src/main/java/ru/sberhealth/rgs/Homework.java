package ru.sberhealth.rgs;

public class Homework {
    public static void main(String[] args) {

        // Создать метод, который принимает аргумент типа String имя пользователя, а также аргумент типа int возраст пользователя
        // метод должен возвращать значение типа String, в котором упоминается имя пользователя и его возраст. Например
        // "Привет, Анатолий! Рады сообщить, что тебе на сегодняшний день 24 года!". Вывести в консоль содержимое строки

        String name = "Анатолий";
        int age = 24;

        String message = greetUser(name, age);
        System.out.println(message);

        // Создать метод, который вычисляет возраст пользователя по его году рождения. Метод должен возвращать число,
        // которое соответствует тому, сколько на данный момент полных лет пользователю. Также вывести на экран это значение


        int birthYear = 1994;
        int userAge = calculateAge(birthYear);
        System.out.println("Пользователю" + name + " " + userAge + " полных лет");

        // Создать метод, который из двух строк делает одну и возвращает новое значение в виде строки. Вывести результат в консоль

        String string1 = "Я хочу";
        String string2 = "какать";
        String combinedString = combineStrings(string1, string2);
        System.out.println(combinedString);

        // Создать метод, который принимает в себя аргумент типа String, в котором должно быть число без дробной части, и возвращает его
        // в виде значения типа int. Вывести результат в консоль

        String numberString1 = "42";
        int number1 = convertToInt(numberString1);
        System.out.println(number1);

        // Создать метод, который принимает в себя аргумент типа String, в котором должно быть число с дробной частью, отделенной точкой, и возвращает его
        // в виде значения типа double. Вывести результат в консоль

        String numberString2 = "3.14";
        double number2 = convertToDouble(numberString2);
        System.out.println(number2);

        // Создать метод, который принимает в себя аргумент типа String, в котором должно быть число с дробной частью, отделенной точкой, и возвращает его
        // в виде округленного значения типа int. Вывести результат в консоль


        String numberString3 = "3.7";
        int roundedNumber = roundToInteger(numberString3);
        System.out.println(roundedNumber);

        // Используя java.lang.Math посчитать квадратный корень для числа 47 и вывести на экран


        double squareRoot47 = Math.sqrt(47);
        System.out.println(squareRoot47);

        // Используя java.lang.Math вывести на экран случайное число типа double, которое будет в границах 0 < число < 1


        double randomDouble = Math.random();
        System.out.println(randomDouble);

        // Используя java.lang.Math вывести на экран большее из двух чисел - 13 и 17


        double maxNumber = Math.max(13, 17);
        System.out.println(maxNumber);

        // Используя java.lang.Math вывести на экран меньшее из двух чисел - 4.5 и 3.8


        double minNumber = Math.min(4.5, 3.8);
        System.out.println(minNumber);

        // Используя java.lang.Math вывести на экран округленные числа 4.5, 5.6 и 2.3


        double roundedNumber1 = Math.round(4.5);
        double roundedNumber2 = Math.round(5.6);
        double roundedNumber3 = Math.round(2.3);
        System.out.println(roundedNumber1);
        System.out.println(roundedNumber2);
        System.out.println(roundedNumber3);
    }

    public static String greetUser(String name, int age) {
        return "Привет, " + name + "! Рады сообщить, что тебе на сегодняшний день " + age + " года!";
    }

    public static int calculateAge(int birthYear) {
        int currentYear = 2023;
        return currentYear - birthYear;
    }

    public static String combineStrings(String string1, String string2) {
        return string1 + " " + string2;
    }

    public static int convertToInt(String numberString) {
        return Integer.parseInt(numberString);
    }

    public static double convertToDouble(String numberString) {
        return Double.parseDouble(numberString);
    }

    public static int roundToInteger(String numberString) {
        double number = Double.parseDouble(numberString);
        return (int) Math.round(number);
    }
}