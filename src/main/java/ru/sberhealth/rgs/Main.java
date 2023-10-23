package ru.sberhealth.rgs;

public class Main {

    public static void main(String[] args) {
        addTwoNumbers(1, 2);
    }


    public static int addTwoNumbers(int a, int b){
        // тело метода
        int sum = a + b;
        System.out.println("Сумма a и b равняется " + sum);
        return sum;
    }

    public static void addTwoNumbersAndPrintResult(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
}
