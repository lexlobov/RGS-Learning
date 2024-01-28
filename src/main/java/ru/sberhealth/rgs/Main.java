package ru.sberhealth.rgs;

import static ru.sberhealth.rgs.Homework.*;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println(calculate(3));

        //Task 2
        int[] massive = {10, 20, 30, 40, 50};
        double[] decimals = convertToDecimal(massive);
        for (double decimal : decimals) {
            System.out.println(decimal);
        }

        //Task 3
        int[] list = {1, 3, 2, 5};
        int[] result = x2SecondElement(list);
        for (int number : result) {
            System.out.println(number);
        }

        //Task 4
        String[] strings = {"Кока", "Бока", "звезда", "Тик-Тока"};
        String builder = addStrings(strings);
        System.out.println(builder);

        //Task 5
        Object[] array1 = {1, 9, 2, 4};
        Object[] reverseArray1 = reverseMassive(array1);
        for (Object object : reverseArray1) {
            System.out.println(object);
        }

        Object[] array2 = {"Кока", "Бока", "звезда", "Тик-Тока"};
        Object[] reverseArray2 = reverseMassive(array2);
        for (Object object : reverseArray2) {
            System.out.println(object);
        }
    }
}
