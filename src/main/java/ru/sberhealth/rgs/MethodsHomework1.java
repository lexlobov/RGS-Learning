package ru.sberhealth.rgs;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MethodsHomework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        scanner.nextLine();

        String user = getUserData(name,age);
        System.out.println(user);
//      Метод принимающий имя пользователя и возраст пользователя


        System.out.println("Введите дату рождения (дд.мм.гггг): ");
        String birthDay = scanner.nextLine();
        int old = calculateAge(birthDay);
        System.out.println("Ваш возраст: " + old + " год(лет)");
//      Метод высчитывающий возраст по дате рождения


        System.out.println("Введите первое слово из двух");
        String str1 = scanner.nextLine();
        System.out.println("Введите второе слово из двух");
        String str2 = scanner.nextLine();

        String concatenatedString = concatenateStrings(str1, str2);
//      Метод объединяющий две сторки в одну


        String intString = "123";
        int convertedInt = convertToInt(intString);
//      Метод превращающий стрингу в целочисленное число


        String doubleString = "3.5";
        double convertedDouble = convertToDouble(doubleString);
//      Метод превращающий стрингу в число с плавающей точкой


        String roundDoubleString = "1.45";
        int convertedRoundInt = convertToRoundedInt(roundDoubleString);
//      Метод округляющий число с плавающей точкой


        double number = 47;
        double squareRoot = Math.sqrt(number);
        System.out.println("Квадратный корень числа " + number + " равен: " + squareRoot);
//      Рассчет корня из 47


        double randomDouble = Math.random();
        System.out.println("Случайное число от 0 до 1: " + randomDouble);
//      Выводим рандомное число от 0 до 1


        int number1 = 13;
        int number2 = 17;
        int maxNumber = Math.max(number1, number2);
        System.out.println("Большее число: " + maxNumber);
//      Выводим большее число из 13 и 17


        double double1 = 4.5;
        double double2 = 3.8;
        double minNumber = Math.min(double1, double2);
        System.out.println("Меньшее число: " + minNumber);
//      Выводим меньшее число из 4.5 и 3.8


        double roundDouble1 = 4.5;
        double roundDouble2 = 5.6;
        double roundDouble3 = 2.3;

        long roundedNumber1 = Math.round(roundDouble1);
        long roundedNumber2 = Math.round(roundDouble2);
        long roundedNumber3 = Math.round(roundDouble3);

        System.out.println("Округление числа 4.5: " + roundedNumber1);
        System.out.println("Округление числа 5.6: " + roundedNumber2);
        System.out.println("Округление числа 2.3: " + roundedNumber3);
//      Выводим округленные числа 4.5, 5.6 и 2.3
    }


    public static String getUserData(String name, int age) {
        if (age == 999){
            throw new IllegalArgumentException("Столько не живут");
        }
        return ("Привет, "+ name +"! Рады сообщить, что тебе на сегодняшний день "+ age +" года!");
    }
    /*
    Создать метод, который принимает аргумент типа String имя пользователя, а также аргумент типа int возраст пользователя
    метод должен возвращать значение типа String, в котором упоминается имя пользователя и его возраст. Например
    "Привет, Анатолий! Рады сообщить, что тебе на сегодняшний день 24 года!". Вывести в консоль содержимое строки
    */


    public static int calculateAge(String dateOfBirth) {
        LocalDate birthday = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        return period.getYears();
    }
    /*
    Создать метод, который вычисляет возраст пользователя по его году рождения. Метод должен возвращать число,
    которое соответствует тому, сколько на данный момент полных лет пользователю. Также вывести на экран это значение
    */


    public static String concatenateStrings(String string1, String string2) {
        String result = string1 + " " + string2;
        System.out.println("Это результат объединения двух слов: " + result);
        return result;
    }
    /*
    Создать метод, который из двух строк делает одну и возвращает новое значение в виде строки. Вывести результат в консоль
    */


    public static int convertToInt(String numberString) {
        int intNumber = Integer.parseInt(numberString);
        System.out.println("Строка превратилась в целочисленное число: " + intNumber);
        return intNumber;
    }
    /*
    Создать метод, который принимает в себя аргумент типа String, в котором должно быть число без дробной части, и возвращает его
    в виде значения типа int. Вывести результат в консоль
    */


    public static double convertToDouble(String doubleString) {
        double dubNumber = Double.parseDouble(doubleString);
        System.out.println("Строка превратилась в число с плавающей точкой: " + dubNumber);
        return dubNumber;
    }
    /*
    Создать метод, который принимает в себя аргумент типа String, в котором должно быть число с дробной частью, отделенной точкой,
    и возвращает его в виде значения типа double. Вывести результат в консоль
    */


    public static int convertToRoundedInt(String roundDoubleString) {
        double dubNumber = Double.parseDouble(roundDoubleString);
        int roundedNumber = (int) Math.round(dubNumber);
        System.out.println("Округленное число: " + roundedNumber);
        return roundedNumber;
    }
    /*
    Создать метод, который принимает в себя аргумент типа String, в котором должно быть число с дробной частью, отделенной точкой,
    и возвращает его в виде округленного значения типа int. Вывести результат в консоль
    */


// Используя java.lang.Math посчитать квадратный корень для числа 47 и вывести на экран

// Используя java.lang.Math вывести на экран случайное число типа double, которое будет в границах 0 < число < 1

// Используя java.lang.Math вывести на экран большее из двух чисел - 13 и 17

// Используя java.lang.Math вывести на экран меньшее из двух чисел - 4.5 и 3.8

// Используя java.lang.Math вывести на экран округленные числа 4.5, 5.6 и 2.3



}