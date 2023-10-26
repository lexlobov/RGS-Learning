package ru.sberhealth.rgs;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MethodsHomeWork{

    /*
        Создать метод, который принимает аргумент типа String имя пользователя, а также аргумент типа int возраст пользователя
        метод должен возвращать значение типа String, в котором упоминается имя пользователя и его возраст. Например
        "Привет, Анатолий! Рады сообщить, что тебе на сегодняшний день 24 года!". Вывести в консоль содержимое строки
    */

    public static String userDataGet(String name, int age){

        String ageNamingType = "";
        if (age <= 4){
            ageNamingType = " года!";
        } else if (age < 21){
            ageNamingType = " лет!";
        } else if (age == 21) {
            ageNamingType = " год!";
        } else if (age >= 22 && age <= 24){ // не могу понять, почему ругается на условие. Кажется косяк с == на 22 строке
            ageNamingType = " года!";
        } else {
            ageNamingType = " Годов, лет, зим -  Мне тупо надоело ифэлсить";
        }
        {


        }

        String basicHelloToliAnal = ("Привет, " + name + "! Рады сообщить, что тебе на сегодняшний день " + age + ageNamingType);
        System.out.println(basicHelloToliAnal);
        return basicHelloToliAnal;
    }


    /*
        Создать метод, который вычисляет возраст пользователя по его году рождения. Метод должен возвращать число,
        которое соответствует тому, сколько на данный момент полных лет пользователю. Также вывести на экран это значение
    */
    public static int ageCalculation(int yearOfBirth){

        Calendar getYear = Calendar.getInstance();
        int currYear = getYear.get(Calendar.YEAR);
        int currAge = Math.subtractExact(currYear, yearOfBirth);
        System.out.println(currAge);
        return currAge;
    }

    // Создать метод, который из двух строк делает одну и возвращает новое значение в виде строки. Вывести результат в консоль
    public static void unitStrings(String firstText, String secondText){

        String unity = firstText + secondText;
        System.out.println(unity);
    }

    /*
        Создать метод, который принимает в себя аргумент типа String, в котором должно быть число без дробной части, и возвращает его
        в виде значения типа int. Вывести результат в консоль
    */
    public static void stringToInt(String firstText){

        int convertString =  Integer.parseInt(firstText);
        System.out.println(convertString);
    }


    /*
        Создать метод, который принимает в себя аргумент типа String, в котором должно быть число с дробной частью, отделенной точкой, и возвращает его
        виде значения типа double. Вывести результат в консоль
    */
    public static void stringToDouble(String firstText){

        double convertString =  Double.parseDouble(firstText);
        System.out.println(convertString);
    }


    /*
        Создать метод, который принимает в себя аргумент типа String, в котором должно быть число с дробной частью, отделенной точкой, и возвращает его
        в виде округленного значения типа int. Вывести результат в консоль
    */

    // ту хуйня, не могу понять что не так делаю
    public static void doubleRoundToInt(double newDouble){

        double test = Math.round(newDouble);
        int tests = (int) test;
        System.out.println(tests);
    }


    public static void mathCumbackToSchool(){

    // Используя java.lang.Math посчитать квадратный корень для числа 47 и вывести на экран
        double squareRoot = Math.sqrt(47);
        System.out.println(squareRoot);

    // Используя java.lang.Math вывести на экран случайное число типа double, которое будет в границах 0 < число < 1
        double getRandomNum = (Math.random() * 1);
        System.out.println(getRandomNum);

    // Используя java.lang.Math вывести на экран большее из двух чисел - 13 и 17
        int firstIntNum = 13;
        int secondIntNum = 17;
        int comparisonIntResult = Math.max(firstIntNum, secondIntNum);
        System.out.println(comparisonIntResult);

    // Используя java.lang.Math вывести на экран меньшее из двух чисел - 4.5 и 3.8
        double firstDoubleNum = 4.5;
        double secondDoubleNum = 3.8;
        double comparisonDoubleResult = Math.min(firstDoubleNum, secondDoubleNum);
        System.out.println(comparisonDoubleResult);

    // Используя java.lang.Math вывести на экран округленные числа 4.5, 5.6 и 2.3
        double [] numbers  = new double[]{4.5, 5.6, 2.3};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.round(numbers[i]);
            int resultNums = (int)numbers[i];
            System.out.println(resultNums);
        }

    }
}


