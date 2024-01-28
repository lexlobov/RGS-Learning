package ru.sberhealth.rgs;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // цикл 100 раз выведет в консоль текст
        for (int i = 0; i < 100; i++){
            System.out.println("Проход цикла № " + i);
        }

        // вариант цикла, где счетчик дробный и увеличение не на единицу
        for (double count = 4.9; count < 7.4; count = count + 0.1){
            System.out.println(count);
        }

        // бесконечный цикл
        for (int i = 0; i < -100; i++){
            System.out.println("Проход цикла № " + i);
        }

        // цикл с предусловием while
        int count = 0;
        while (count < 10) {
            System.out.println("Проход цикла while № " + count);
            count++;
        }

        // бесконечный вариант цикла while (закомментирован, потому что программа не сможет пойти дальше)
//        while (true) {
//            System.out.println("Бесконечный цикл");
//        }

        // бесконечный вариант цикла, пока пользователь не введет в консоль определенное слово
        Scanner scanner = new Scanner(System.in);
        String quit = "no";
        while (!quit.equals("quit")){
            System.out.println("11");
            System.out.println("Enter 'quit' to exit: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("quit")){
                quit = userInput;
            }
        }

        // цикл с постусловием do while, который не заканчивается, пока пользователь не введет определенное слово
        Scanner scanner1 = new Scanner(System.in);
        quit = "quit";
        do{
            System.out.println("11");
            System.out.println("Enter 'quit' to exit: ");
            String userInput = scanner.nextLine();
            quit = userInput;
        } while (!quit.equals("quit"));
        scanner.close();

        // задание массива целых чисел размерностью 10
        int[] intArray = new int[10];

        // присвоение первому элементу массива значения 123
        intArray[0] = 123;

        // присвоение переменной типа int a значения равного первому элементу массива
        int a = intArray[0];

        // получение количества элементов, входящих в массив (размера, длины)
        int lengthOfArray = intArray.length;

        // инициализация массива значениями при создании
        String[] strings = {"String 1", "String 2"};

        // создание массива целых чисел и умножение каждого элемента на 2 вручную
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ints[0] = ints[0] * 2;
        ints[1] = ints[1] * 2;
        ints[2] = ints[2] * 2;
        //       ...
        // a few moments later
        //       ...
        ints[9] = ints[9] * 2;

        // назначаем значения массива заново
        ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // умножение каждого элемента массива на 2 в цикле
        for (int i = 0; i < ints.length; i++){
            ints[i] = ints[i] * 2;
            System.out.println(ints[i]);
        }

        ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // поиск числа 5 в массиве
        boolean isFiveInArray = false;
        System.out.println("Находится ли 5 в массиве? - " + isFiveInArray);
        for(int i = 0; i < ints.length; i++){
            if (ints[i] == 5){
                System.out.println("5 найдено в массиве");
                isFiveInArray = true;
                break;
            }
        }
        System.out.println("Находится ли 5 в массиве теперь? - " + isFiveInArray);

        // умножение каждого элемента массива на 2 кроме пятерки
        for(int i = 0; i < ints.length; i++){
            if (ints[i] == 5){
                continue;
            }
            ints[i] = ints[i] * 2;
        }
    }
}