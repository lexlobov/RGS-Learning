package ru.sberhealth.rgs;

import java.util.ArrayList;
import java.util.List;

public class Methods {

    public static void main(String[] args) {
        // Вызываем метод, который складывает два числа, отдает сумму и печатает результат в консоль
        addTwoNumbers(1, 2);
        int numberOne = 7;
        int numberTwo = 9;
        addTwoNumbers(numberOne, numberTwo);


        // Создаем переменную типа double, в которую помещаем результат работы метода, вычисляющего среднее значение
        // всех входящих в него аргументов, затем выводим на консоль среднее значение
        double average = getAverage(13.5, 24.3, 10.4, 11.9, 98.8);
        System.out.println(average);
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
    public static double getAverage(double ... d) {
        int dLength = d.length;
        double sum = 0;
        for (int i = 0; i < dLength; i++){
            sum = (sum + d[i]);
        }
        double average = sum / dLength;
        return average;
    }
}
