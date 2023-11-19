package ru.sberhealth.rgs;

import java.util.Arrays;

public class Homework {

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

    // Написать метод, который будет принимать в себя массив целых чисел, каждое из них превращать в дробное, и возвращать массив дробных чисел
    // с теми же значениями, что и целые

    public static double [] convertIntToDouble(Integer []  newArrayNumbers) {

        double[] resultMassive = new double[newArrayNumbers.length];
        for (int i = 0; i < newArrayNumbers.length; i++) {

            resultMassive[i] = newArrayNumbers[i].doubleValue();

        }
        ;
        return (resultMassive);
    }

    // Написать метод, который будет принимать в себя массив целых чисел в качестве аргумента, каждый второй элемент этого массива умножать на 2
    // и затем вернет массив с результатом этих операций. Не использовать оператор if

    public static int [] sumEverySecondNumber(Integer [] newSecondArrayNumbers){

        int [] resultArray = new int [newSecondArrayNumbers.length / 2] ;
        for (int i = 0, j = 0; i < newSecondArrayNumbers.length; i += 2, j ++) {

            resultArray[j] = newSecondArrayNumbers[i] * 2;
        }
        return resultArray;
    }

    // Написать метод, который принимает в себя массив строк и из них возвращает одну большую строку, каждый элемент в
    // результирующей строке отделяется от предыдущего запятой

}
