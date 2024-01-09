package ru.sberhealth.rgs;

import static ru.sberhealth.rgs.Homework.*;


public class main {

    // Все методы написать в этом классе, вызывать в классе Main в методе main
    // Написать метод, который будет считать начиная с 1 сумму каждого текущего числа и предыдущего. Число операций должно быть принято в качестве аргумента.
    // Метод должен вернуть число, которое получится в итоге
    public static void main(String[] args) {
        int numOperations = 7;
        int result = calculateSum(numOperations);
        System.out.println("Результат: " + result);

        // Написать метод, который будет принимать в себя массив целых чисел, каждое из них превращать в дробное, и возвращать массив дробных чисел
        // с теми же значениями, что и целые


        int[] massive = {10, 20, 30, 40, 50};
        double[] decimals = convertToDecimal(massive);

        for (double decimal : decimals) {
            System.out.println(decimal);
        }

        // Написать метод, который будет принимать в себя массив целых чисел в качестве аргумента, каждый второй элемент этого массива умножать на 2
        // и затем вернет массив с результатом этих операций. Не использовать оператор if

        int[] array = {1, 5, 8, 6};
        int[] res = multiplyEverySecondElement(array);

        for (int number : res) {
            System.out.println(number);
        }

        // Написать метод, который принимает в себя массив строк и из них возвращает одну большую строку, каждый элемент в
        // результирующей строке отделяется от предыдущего запятой

        String[] strings = {"Строка 1", "Строка 2", "Строка 3"};
        String builder = joinStrings(strings);
        System.out.println(builder);



    }
}
