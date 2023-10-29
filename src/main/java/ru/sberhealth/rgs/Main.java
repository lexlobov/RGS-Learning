package ru.sberhealth.rgs;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // Создать метод, который принимает массив целых чисел и возвращает его в обратном порядке
        Scanner arrayScanner = new Scanner(System.in);


        System.out.println("Input your array length");
        int arrayLength = arrayScanner.nextInt();

        Integer [] firstTaskArr = new Integer[arrayLength];
        System.out.println("Enter your numbers");

        for (int i = 0; i < arrayLength; i++) {
            firstTaskArr[i] = arrayScanner.nextInt();

        }

        getFirstUserIntMassive(firstTaskArr);

        // Создать метод, который принимает массив целых чисел и к каждому числу прибавляет предыдущее, затем возвращает массив с новыми значениями
        System.out.println("Input your second array length");
        int secondTaskArrLength = arrayScanner.nextInt();

        int [] secondTaskArr = new int[secondTaskArrLength];
        System.out.println("Enter your numbers");

        for (int i = 0; i < secondTaskArrLength; i++) {
            secondTaskArr[i] = arrayScanner.nextInt();

        }

        getSecondUserIntMassive(secondTaskArr);


     /*
     Создать метод, который принимает массив целых чисел, считает среднее арифметическое всех входящих элементов
     и возвращает ответ в виде целого числа. Результат должен быть округлен в большую сторону
     */

    System.out.println("Input your third array length");
    int thirdTaskArrLength = arrayScanner.nextInt();

    int [] thirdTaskArr = new int[thirdTaskArrLength];
        System.out.println("Enter your numbers");

        for (int i = 0; i < thirdTaskArrLength; i++) {
        thirdTaskArr[i] = arrayScanner.nextInt();

    }

    getThirdUserIntMassive(thirdTaskArr);

    }


    // Создать метод, который принимает массив целых чисел и возвращает его в обратном порядке
    public static String getFirstUserIntMassive(Integer[] firstTaskArr){


       System.out.println(Arrays.toString(firstTaskArr));

       List<Integer> list = Arrays.asList(firstTaskArr);
       Collections.reverse(list);

       System.out.println(list);

        return list.toString();
    }


    // Создать метод, который принимает массив целых чисел и к каждому числу прибавляет предыдущее, затем возвращает массив с новыми значениями
    public static int[] getSecondUserIntMassive(int[] secondTaskArr){

        System.out.println(Arrays.toString(secondTaskArr));

        int [] arrWithSum = new int[secondTaskArr.length];
        arrWithSum[0] = secondTaskArr[0];

        for (int i = 1; i < arrWithSum.length; i++) {

            arrWithSum[i] = secondTaskArr[i] + secondTaskArr[i - 1];

        }

        System.out.println(Arrays.toString(arrWithSum));

    return arrWithSum;
    }


    // Создать метод, который принимает массив целых чисел, считает среднее арифметическое всех входящих элементов и возвращает ответ в виде целого числа
    // Результат должен быть округлен в большую сторону
    public static double getThirdUserIntMassive(int[] thirdTaskArr){

        System.out.println(Arrays.toString(thirdTaskArr));

        double arrNumsSum = IntStream.of(thirdTaskArr).sum();
        double arrLength = thirdTaskArr.length;
        // long arrNumsCount = IntStream.of(thirdTaskErr).count();
        int avgOfErr = (int) Math.ceil(arrNumsSum / arrLength);

        System.out.println(avgOfErr);

        return avgOfErr;
    }
}
