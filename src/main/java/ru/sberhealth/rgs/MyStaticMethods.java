package ru.sberhealth.rgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyStaticMethods {
    public static double getAvg() {
        Scanner scanner = new Scanner(System.in);

        // Новый список arr
        List<Integer> userIntArray = new ArrayList<>();

        // Пока вводим инт - продолжаем запрашивать числа и записывать значение test в список
        // Если ввели quit - завершаем цикл
        while (true) {

            System.out.println("Enter your integers (or quit to exit): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                break;
            } else {
                int newInt = Integer.parseInt(userInput);
                userIntArray.add(newInt);
            }
        }

        // Приводим значения клс Integer к примитиву int, получаем среднее арифметическое и отдаем как double
        return userIntArray.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public static String joinUserStrings() {
        Scanner scanner = new Scanner(System.in);

        List<String> userStringArray = new ArrayList<>();

        // логика схожая с предыдущим методом
        while (true) {

            System.out.println("Enter your strings (or quit to exit): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                break;
            } else {
                userStringArray.add(userInput);
            }
        }

        // используем join метод класса String с ограничителем строка с пробелом для вывода значений из массива
        // в одну строку
        return String.join(" ", userStringArray);
    }

    public static int getSum() {
        Scanner scanner = new Scanner(System.in);

        // Новый список arr
        List<Object> newUserArray = new ArrayList<>();

        // Пока вводим инт - продолжаем запрашивать числа и записывать значение test в список
        // Если ввели quit - завершаем цикл
        while (true) {

            System.out.println("Enter your integers (or quit to exit): ");
            Object userInput = scanner.nextLine();

            if (userInput.equals("quit")) {
                break;
            } else {
                newUserArray.add(userInput);
            }
        }

        /*
         Тут не очень понял, что требовалось - кол-во элементов массива (то есть их суммарное кол-во)
         или сумма этих элементов? Поскольку тип данных задан не был - я использовал тип Object для получения данных.
         Если сумма, то какой тип данных нужен?
         Для суммы можно было бы использовать return getSum(newUserArray) изменив тип списка на, например, Integer;
         */
        return newUserArray.size();
    }
}




