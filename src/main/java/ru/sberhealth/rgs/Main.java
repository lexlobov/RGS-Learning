package ru.sberhealth.rgs;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Написать метод, который будет считать начиная с 1 сумму каждого текущего числа и предыдущего. Число операций должно быть принято в качестве аргумента.
        // Метод должен вернуть число, которое получится в итоге

        System.out.println("Enter count of Fibbonachi iterations: ");

        int iterations = scanner.nextInt();

        int result = Homework.getSumResult(iterations);
        System.out.println(result);


        // Написать метод, который будет принимать в себя массив целых чисел, каждое из них превращать в дробное, и возвращать массив дробных чисел
        // с теми же значениями, что и целые
        System.out.println("Enter length of your array: ");
        int newArrayLength = scanner.nextInt();

        System.out.println("Enter your numbers: ");
        Integer [] newArrayNumbers = new Integer[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {

            newArrayNumbers[i] = scanner.nextInt();

        }

        double [] resultMassive = Homework.convertIntToDouble(newArrayNumbers);
        System.out.println(Arrays.toString(resultMassive));



        // Написать метод, который будет принимать в себя массив целых чисел в качестве аргумента, каждый второй элемент этого массива умножать на 2
        // и затем вернет массив с результатом этих операций. Не использовать оператор if


        // Написать метод, который принимает в себя массив строк и из них возвращает одну большую строку, каждый элемент в
        // результирующей строке отделяется от предыдущего запятой


        // Написать метод, который принимает в себя в качестве аргумента массив любых объектов, разворачивает его в обратном порядке
        // (первый элемент становится последним, последний элемент становится первым) и возвращает
    }
}
