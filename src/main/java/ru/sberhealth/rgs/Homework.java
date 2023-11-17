package ru.sberhealth.rgs;

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
}
