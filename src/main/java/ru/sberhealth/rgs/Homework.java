package ru.sberhealth.rgs;

import java.util.StringJoiner;

public class Homework {

    // Все методы написать в этом классе, вызывать в классе Main в методе main
    // Написать метод, который будет считать начиная с 1 сумму каждого текущего числа и предыдущего. Число операций должно быть принято в качестве аргумента.
    // Метод должен вернуть число, которое получится в итоге

    public static int calculateSum(int numOperations) {
        int next = 1;
        int previous = 0;

        for (int i = 1; i < numOperations; i++) {

            int sum = next + previous;
            previous = next;
            next = sum;
        }

        return next;
    }

    // Написать метод, который будет принимать в себя массив целых чисел, каждое из них превращать в дробное, и возвращать массив дробных чисел
    // с теми же значениями, что и целые

    public static double[] convertToDecimal(int[] massive) {
        double[] deс = new double[massive.length];

        for (int i = 0; i < massive.length; i++) {
            deс[i] = (double) massive[i];
        }

        return deс;
    }


    // Написать метод, который будет принимать в себя массив целых чисел в качестве аргумента, каждый второй элемент этого массива умножать на 2
    // и затем вернет массив с результатом этих операций. Не использовать оператор if

    public static int[] multiplyEverySecondElement(int[] array) {
        for (int i = 1; i < array.length; i += 2) { //{1,5,8,6};
            array[i] *=2;
        }
        return array;
    }

    // Написать метод, который принимает в себя массив строк и из них возвращает одну большую строку, каждый элемент в
    // результирующей строке отделяется от предыдущего запятой

    public static String joinStrings(String[] strings) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]);
            if (i < strings.length - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }

    // Написать метод, который принимает в себя в качестве аргумента массив любых объектов, разворачивает его в обратном порядке
    // (первый элемент становится последним, последний элемент становится первым) и возвращает

    public static <T> T[] reverseArray(T[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            T temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
        return array;
    }


}
