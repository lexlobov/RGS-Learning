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
}
