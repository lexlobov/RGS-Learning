package ru.sberhealth.rgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Homework {

    public static void main(String[] args) throws IOException {
        // Создать метод, который принимает аргумент типа String имя пользователя, а также аргумент типа int возраст пользователя
        // метод должен возвращать значение типа String, в котором упоминается имя пользователя и его возраст. Например
        // "Привет, Анатолий! Рады сообщить, что тебе на сегодняшний день 24 года!". Вывести в консоль содержимое строки

        nameAndAgeForMe();
        System.out.println(nameAndAgeV1("Александр", 33));



        // Создать метод, который вычисляет возраст пользователя по его году рождения. Метод должен возвращать число,
        // которое соответствует тому, сколько на данный момент полных лет пользователю. Также вывести на экран это значение
        System.out.println("Your age: " + agesByBirthDate(1990, 1, 25));

        // Создать метод, который из двух строк делает одну и возвращает новое значение в виде строки. Вывести результат в консоль
        System.out.println(twoStringsInOne("I'm blue", "dabudi dabidai"));

        // Создать метод, который принимает в себя аргумент типа String, в котором должно быть число без дробной части, и возвращает его
        // в виде значения типа int. Вывести результат в консоль
        System.out.println(stringToInt("5"));

        // Создать метод, который принимает в себя аргумент типа String, в котором должно быть число с дробной частью, отделенной точкой, и возвращает его
        // в виде значения типа double. Вывести результат в консоль
        System.out.println(stringToDouble("5.6"));

        // Создать метод, который принимает в себя аргумент типа String, в котором должно быть число с дробной частью, отделенной точкой, и возвращает его
        // в виде округленного значения типа int. Вывести результат в консоль
        System.out.println(roundStringDoubleToInt("6.7"));

        // Используя java.lang.Math посчитать квадратный корень для числа 47 и вывести на экран
        System.out.println(Math.sqrt(47));

        // Используя java.lang.Math вывести на экран случайное число типа double, которое будет в границах 0 < число < 1
        System.out.println(Math.random());

        // Используя java.lang.Math вывести на экран большее из двух чисел - 13 и 17
        System.out.println(Math.max(13, 17));

        // Используя java.lang.Math вывести на экран меньшее из двух чисел - 4.5 и 3.8
        System.out.println(Math.min(4.5, 3.8));

        // Используя java.lang.Math вывести на экран округленные числа 4.5, 5.6 и 2.3
        System.out.println(Math.round(4.5));
        System.out.println(Math.round(5.6));
        System.out.println(Math.round(2.3));
    }

    public static void nameAndAgeForMe() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваше имя!");
        String name = reader.readLine();
        System.out.println("Введите ваш возраст");
        String age = reader.readLine();
        System.out.println("Привет, " + name + "! Рады сообщить, что тебе на сегодняшний день " + age +" года!");
    }

    public static String nameAndAgeV1(String name, int age) {
        return "Привет, " + name + "! Рады сообщить, что тебе на сегодняшний день " + age + " года!";
    }

    public static String twoStringsInOne(String first, String second){
        return first + " " + second;
    }

    public static int stringToInt(String string){
        return Integer.parseInt(string);
    }

    public static double stringToDouble(String string){
        return Double.parseDouble(string);
    }

    public static int roundStringDoubleToInt(String string){
        int indexOfDot = string.indexOf(".");
        int numberAfterDot = Integer.parseInt(string.substring(indexOfDot + 1, indexOfDot + 2));
        int numberBeforeDot = Integer.parseInt(string.substring(0, indexOfDot));
        if (numberAfterDot < 5){
            return numberBeforeDot;
        }
        else return numberBeforeDot + 1;
    }

    public static int agesByBirthDate(int year, int month, int day){
        LocalDate currentDate = LocalDate.now();
        if(currentDate.getMonthValue() < month ||(currentDate.getMonthValue() == month && currentDate.getDayOfMonth() < day)){
            return currentDate.getYear() - year - 1;
        }
        else return currentDate.getYear() - year;
    }
}
