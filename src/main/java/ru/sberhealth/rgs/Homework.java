package ru.sberhealth.rgs;

import java.util.StringJoiner;


public class Homework {

    // Task 1
    public static int getSumResult(int iterations) {
        if (iterations < 1){
            throw new IllegalArgumentException("Iteration should be greater than 0");
        }
        int previousNum = 0;
        int nextNum = 1;
        for (int i = 0; i <= iterations; i++) {

            int fibbonachi = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = fibbonachi;

        }
        return nextNum;
    }

    // Task 2
    // Написать метод, который будет принимать в себя массив целых чисел, каждое из них превращать в дробное, и возвращать массив дробных чисел
    // с теми же значениями, что и целые

    public static double [] convertIntToDouble(Integer []  newArrayNumbers) {

        double[] resultMassive = new double[newArrayNumbers.length];
        for (int i = 0; i < newArrayNumbers.length; i++) {

            resultMassive[i] = newArrayNumbers[i].doubleValue();

        }
        return (resultMassive);
    }

    // Task 3
    // Написать метод, который будет принимать в себя массив целых чисел в качестве аргумента, каждый второй элемент этого массива умножать на 2
    // и затем вернет массив с результатом этих операций. Не использовать оператор if

    public static int [] sumEverySecondNumber(Integer [] newSecondArrayNumbers){
        if (newSecondArrayNumbers.length % 2 != 0){
            throw new IllegalArgumentException("Array should be even");
        }


        int [] resultArray = new int [newSecondArrayNumbers.length / 2] ;
        for (int i = 0, j = 0; i < newSecondArrayNumbers.length; i += 2, j ++) {

            resultArray[j] = newSecondArrayNumbers[i] * 2;
        }
        return resultArray;
    }

    // Task 4
    // Написать метод, который принимает в себя массив строк и из них возвращает одну большую строку, каждый элемент в
    // результирующей строке отделяется от предыдущего запятой

    public static String unitArrayStrings(String [] newStringArray){

        StringJoiner joiner = new StringJoiner(",");
        for (String nextString : newStringArray) {

            joiner.add(nextString);
        }

        return joiner.toString();
    }

    // Task 5
    // Написать метод, который принимает в себя в качестве аргумента массив любых объектов, разворачивает его в обратном порядке
    // (первый элемент становится последним, последний элемент становится первым) и возвращает

    public static Object [] reverseObjectArray(Object [] newStringArray){
        return ArrayReverse.reverseArray(newStringArray);
    }

}
