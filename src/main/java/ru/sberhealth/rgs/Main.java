package ru.sberhealth.rgs;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


        // Задание 1
        // Создать метод, который принимает массив целых чисел и возвращает его в обратном порядке
        Scanner arrayScanner = new Scanner(System.in);

        // Получаем длину ожидаемую длину массива
        System.out.println("Input your array length");
        int arrayLength = arrayScanner.nextInt();

        // Запрашиваем числа массива
        Integer [] firstTaskArr = new Integer[arrayLength];
        System.out.println("Enter your numbers");

        // Запрашиваем числа до тех пор, пока кол-во введенных данных не достигнет указанной длины массива
        for (int i = 0; i < arrayLength; i++) {
            firstTaskArr[i] = arrayScanner.nextInt();

        }

        // Создаем переменную результата метода getFirstUserIntMassive и выводим в консоль
        String resultFirstTask =  getFirstUserIntMassive(firstTaskArr);
        System.out.println(resultFirstTask);



        /* Задание 2
           Создать метод, который принимает массив целых чисел и к каждому числу прибавляет предыдущее,
           затем возвращает массив с новыми значениями
        */


        // Получаем длину ожидаемую длину массива
        System.out.println("Input your second array length");
        int secondTaskArrLength = arrayScanner.nextInt();

        // Запрашиваем числа массива
        int [] secondTaskArr = new int[secondTaskArrLength];
        System.out.println("Enter your numbers");

        // Запрашиваем числа до тех пор, пока кол-во введенных данных не достигнет указанной длины массива
        for (int i = 0; i < secondTaskArrLength; i++) {
            secondTaskArr[i] = arrayScanner.nextInt();

        }

        /* Создаем переменную (массив) результата метода getSecondUserIntMassive и выводим в консоль
        Выводим результат в консоль приводя массив к строке
         */
        int[] resultSecondTask =  getSecondUserIntMassive(secondTaskArr);
        System.out.println(Arrays.toString(resultSecondTask));



        // Задание 3
     /*
     Создать метод, который принимает массив целых чисел, считает среднее арифметическое всех входящих элементов
     и возвращает ответ в виде целого числа. Результат должен быть округлен в большую сторону
     */

    // Получаем длину ожидаемую длину массива
    System.out.println("Input your third array length");
    int thirdTaskArrLength = arrayScanner.nextInt();

    // Запрашиваем числа массива
    int [] thirdTaskArr = new int[thirdTaskArrLength];
        System.out.println("Enter your numbers");

        // Запрашиваем числа до тех пор, пока кол-во введенных данных не достигнет указанной длины массива
        for (int i = 0; i < thirdTaskArrLength; i++) {
        thirdTaskArr[i] = arrayScanner.nextInt();

    }

        // Создаем переменную результата метода getSecondUserIntMassive приводя double к int и выводим в консоль
        int resultThirdTask =   (int) getThirdUserIntMassive(thirdTaskArr);
        System.out.println(resultThirdTask);

    }



    // Задание 1 метод
    // Создать метод, который принимает массив целых чисел и возвращает его в обратном порядке
    public static String getFirstUserIntMassive(Integer[] firstTaskArr){
        if (firstTaskArr.length == 0) { // кидаем исключение, если передан пустой массив
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        // нужен для проверки данных (что соддержит после пользозвательского ввода)
       System.out.println(Arrays.toString(firstTaskArr));

        /*
         Создаем неизменяемый список list из массива firstTaskArr
         Для элементов списка выполняем метод reverse класса Collections
         */
       List<Integer> list = Arrays.asList(firstTaskArr);
       Collections.reverse(list);

        // Возвращаем данные списка приводя к стринге
        return list.toString();
    }



    // Задание 2 метод
    // Создать метод, который принимает массив целых чисел и к каждому числу прибавляет предыдущее, затем возвращает массив с новыми значениями
    public static int[] getSecondUserIntMassive(int[] secondTaskArr){
        if (secondTaskArr.length == 0) { // кидаем исключение, если передан пустой массив
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        // нужен для проверки данных (что содержит после пользозвательского ввода)
        System.out.println(Arrays.toString(secondTaskArr));

        /*
        Создаем массив arrWithSum и определяем, что его длина = длине secondTaskArr
        При этом индекс 0 arrWithSum будет таким же как у переданного пользователем значения в secondTaskArr
         */
        int [] arrWithSum = new int[secondTaskArr.length];
        arrWithSum[0] = secondTaskArr[0];

        /*
         Пропускаем нулевой индекс (1-е число), Определяем, что каждое значение
         arrWithSum == сумме i nекущей итерации и предыдущему значению i (i-1) пользовательского массива secondTaskArr
         */
        for (int i = 1; i < arrWithSum.length; i++) {
            arrWithSum[i] = secondTaskArr[i] + secondTaskArr[i - 1];
        }

    // Возвращаем массив
    return arrWithSum;
    }



    // Задание 3 метод
    /*
    Создать метод, который принимает массив целых чисел, считает среднее арифметическое всех входящих элементов и возвращает ответ в виде целого числа
        Результат должен быть округлен в большую сторону
     */
    public static double getThirdUserIntMassive(int[] thirdTaskArr){
        if (thirdTaskArr.length == 0) { // кидаем исключение, если передан пустой массив
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        /*
        Создаем из массива thirdTaskArr стрим avgOfArr
        Получаем среднее арифметическое используя метод average OptionalDouble и получаем результат как
        значение double
        После возвращаем округленное вверх значение avgOfArr double приводя его к целому числу int
         */
        double avgOfArr = Arrays.stream(thirdTaskArr).average().getAsDouble();
        return (int) Math.ceil(avgOfArr);

        /*
        Изначально был такой вариант:
        1. Получал сумму элементов в стриме (элементы массива в элементы стрима)
        2. Получал длину массива
        3. Делил сумму элементов стрима на длину массива, округляя вверх через Math.ceil

        но решил загуглить по поводу оптимизации и оказалось, что все
        можно сделать юзая метод stream из Arrays

        double arrNumsSum = IntStream.of(thirdTaskArr).sum();
        double arrLength = thirdTaskArr.length;
        // long arrNumsCount = IntStream.of(thirdTaskErr).count();
        int avgOfErr = (int) Math.ceil(arrNumsSum / arrLength);
        System.out.println(avgOfErr);
        return avgOfErr;
        */
    }
}
