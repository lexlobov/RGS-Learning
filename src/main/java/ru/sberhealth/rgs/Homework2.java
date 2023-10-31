package ru.sberhealth.rgs;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        // Создать метод, который принимает массив целых чисел и возвращает его в обратном порядке
        viceVerseOrder();

        // Создать метод, который принимает массив целых чисел и к каждому числу прибавляет предыдущее, затем возвращает массив с новыми значениями
        currentPlusNextMassive();

        // Создать метод, который принимает массив целых чисел, считает среднее арифметическое всех входящих элементов и возвращает ответ в виде целого числа
        // Результат должен быть округлен в большую сторону
        arithmeticMean();


    }

    public static void viceVerseOrder() {
        int[] array = intMassiveFromKeyboard();
        System.out.println("Элементы в обратном порядке");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void currentPlusNextMassive(){
        int[] array = intMassiveFromKeyboard();
        System.out.println("к каждому числу прибавить предыдущее");
        for(int i = 0; i < array.length; i++){
            if (i == 0){
                System.out.println(array[i]);
            }
            else System.out.println(array[i] + array[i - 1]);
        }
    }

    public static void arithmeticMean(){
        int[] array = intMassiveFromKeyboard();
        System.out.println("Среднее арифметическое");
        int sum = 0;
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
            counter++;
        }
        System.out.println((double) sum / (double) counter);
    }

    private static int[] intMassiveFromKeyboard(){
        Scanner string = new Scanner(System.in);
        System.out.println("введите количество элементов");
        int num = string.nextInt();
        int[] array = new int[num];
        System.out.println("введите элементы");
        for (int i = 0; i < num; i++) {
            array[i] = string.nextInt();
        }
        return array;
    }
}