package ru.sbrehealth.rgs;

public class Variables {

    public static void main(String[] args) {
        // Объявить переменную типа int, присвоить ей значение, вывести на экран в терминале
        int myVariable = 10;
        System.out.println(myVariable);

        // Объявить переменную типа String, присвоить ей значение, вывести на экран в терминале
        String myString;
        myString = "Привет, Вася!";
        System.out.println(myString);
        

        // Объявить две переменные типа int, вывести на экран в терминале их сумму

        int myVarible1 = 7;
        int myVarible2 = 5;
        System.out.println(myVarible1 + myVarible2);

        // Объявить две переменные типа int, вывести на экран в терминале их разность

        int num1 = 7;
        int num2 = 5;
        System.out.println(num1 - num2);


        // Объявить две переменные типа int, вывести на экран их произведение

        int number1 = 7;
        int number2 = 5;
        System.out.println(number1 * number2);

        // Объявить две переменные типа double, вывести на экран в терминале результат деления первой на вторую

        double dun1 = 10.5;
        double dub2 = 3.5;
        System.out.println(dun1/dub2);

        // Объявить переменную типа boolean, вывести на экран в терминале ее значение

        boolean flag = true;
        System.out.println(flag);

        // Объявить две переменные типа String (например "Эта строка из " и " слов") и одну переменную типа int (например 4) и склеить их таким образом,
        // чтобы получилась фраза

        String myStringi1;
        myStringi1 = "Василий красивый";
        String myStringi2;
        myStringi2 = " вы человек";
        int love = 8;
        String myStringi3 = myStringi1 + myStringi2 + love;
        System.out.println(myStringi3);


        // Объявить константу типа String и константу типа int и вывести на экран в терминале их сумму, чтобы получилась фраза

        final String constant = "const ";
        final int number = 8;
        String myConst = constant + number;
        System.out.println(myConst);

        // Объявить две переменные типа int и проиницализировать их значениями, объявить третью переменную, в нее записать результат
        // сложения первых двух, вывести третью переменную на экран

        int one = 5;
        int two = 3;
        int suma = one + two;
        System.out.println(suma);

        // Объявить переменную типа int, присвоить ей значение, затем присвоить еще раз другое значение и  вывести его на экран

        int numberOne = 10;
        numberOne = 15;
        System.out.println(numberOne);
    }
}
