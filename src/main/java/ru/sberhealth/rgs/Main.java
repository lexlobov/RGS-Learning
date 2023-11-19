package ru.sberhealth.rgs;

import java.lang.annotation.Documented;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Task 1
        // Написать метод, который будет считать начиная с 1 сумму каждого текущего числа и предыдущего. Число операций должно быть принято в качестве аргумента.
        // Метод должен вернуть число, которое получится в итоге

        System.out.println("Enter count of Fibbonachi iterations: ");

        int iterations = scanner.nextInt();

        int result = Homework.getSumResult(iterations);
        System.out.println(result);


        // Task 2
        // Написать метод, который будет принимать в себя массив целых чисел, каждое из них превращать в дробное, и возвращать массив дробных чисел
        // с теми же значениями, что и целые
        System.out.println("Enter length of your array: ");
        int newArrayLength = scanner.nextInt();

        System.out.println("Enter your numbers: ");
        Integer[] newArrayNumbers = new Integer[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {

            newArrayNumbers[i] = scanner.nextInt();
        }

        double[] resultArray = Homework.convertIntToDouble(newArrayNumbers);
        System.out.println(Arrays.toString(resultArray));


        // Task 3
        // Написать метод, который будет принимать в себя массив целых чисел в качестве аргумента, каждый второй элемент этого массива умножать на 2
        // и затем вернет массив с результатом этих операций. Не использовать оператор if

        int newSecondArrayLength;
        while (true) {

            System.out.println("Enter length of your array: ");

            int newIntScanner = scanner.nextInt();

            if (newIntScanner % 2 == 0) {
                newSecondArrayLength = newIntScanner;
                break;

            } else System.out.println("The number must be even");
            continue;
        }


        System.out.println("Enter your numbers: ");
        Integer[] newSecondArrayNumbers = new Integer[newSecondArrayLength];
        for (int i = 0; i < newSecondArrayLength; i++) {

            newSecondArrayNumbers[i] = scanner.nextInt();

        }

        int[] sumResultArray = Homework.sumEverySecondNumber(newSecondArrayNumbers);
        System.out.println(Arrays.toString(sumResultArray));


        // Task 4
        // Написать метод, который принимает в себя массив строк и из них возвращает одну большую строку, каждый элемент в
        // результирующей строке отделяется от предыдущего запятой

    /**
        * Строка 91 - зачем это нужно:
        * Проблема здесь заключается в том, что после считывания числа методом `scanner.nextInt()`,
        * Когда вызывается `scanner.nextLine()` в цикле, первый вызов этого метода считывает этот оставшийся символ новой строки с предыдущего ввода,
        * а затем пользователю ни разу не предоставляется возможность ввести свое значение.
        * символ новой строки ("n") остается во внутреннем буфере системы ввода-вывода.
        * Для решения этой проблемы, можно добавить дополнительный вызов `scanner.nextLine()` после `scanner.nextInt()`,
        * чтобы считать оставшийся символ новой строки в буфере перед началом цикла ввода строк
    **/


        System.out.println("Enter length of your string array: ");
        int stringArrayLength = scanner.nextInt();
        scanner.nextLine(); //clear buffer

        System.out.println("Enter your strings: ");
        String[] newStringArray = new String[stringArrayLength];
        for (int i = 0; i < stringArrayLength; i++) {

            newStringArray[i] = scanner.nextLine();
        }

        String resultString = Homework.unitArrayStrings(newStringArray);
        System.out.println(resultString);


        // Написать метод, который принимает в себя в качестве аргумента массив любых объектов, разворачивает его в обратном порядке
        // (первый элемент становится последним, последний элемент становится первым) и возвращает
    }
}
