package ru.sbrehealth.rgs;

public class Variables {

    public static void main(String[] args) {
        // Объявить переменную типа int, присвоить ей значение, вывести на экран в терминале
        int a;
        a = 5;
        System.out.println("int = " + a);

        // Объявить переменную типа String, присвоить ей значение, вывести на экран в терминале
        String string;
        string = "Hello world";
        System.out.println(string);

        // Объявить две переменные типа int, вывести на экран в терминале их сумму
        int c;
        int b;
        c = 5;
        b = 875643;
        int sum = c + b;
        System.out.println("c + b = " + sum);

        // Объявить две переменные типа int, вывести на экран в терминале их разность
        int d;
        int e;
        d = 5;
        e = 875643;
        int dif = d - e;
        System.out.println("d - e = " + dif);

        // Объявить две переменные типа int, вывести на экран их произведение
        int f;
        int g;
        f = 5;
        g = 875643;
        int multi = f * g;
        System.out.println("f * g = " + multi);

        // Объявить две переменные типа double, вывести на экран в терминале результат деления первой на вторую
        double one;
        double two;
        one = 5.5;
        two = 875643;
        double div = one / two;
        System.out.println("one / two = " + div);

        // Объявить переменную типа boolean, вывести на экран в терминале ее значение
        boolean youBeautiful;
        youBeautiful = true;
        System.out.println("You beautiful it's " + youBeautiful);

        // Объявить две переменные типа String (например "Эта строка из " и " слов") и одну переменную типа int (например 4) и склеить их таким образом,
        // чтобы получилась фраза
        int number;
        String word;
        number = 5;
        word = "number ";
        System.out.println(word + number);

        // Объявить константу типа String и константу типа int и вывести на экран в терминале их сумму, чтобы получилась фраза
        final String  first = "Java ";
        final int  second = 8;
        System.out.println(first + second);

        // Объявить две переменные типа int и проиницализировать их значениями, объявить третью переменную, в нее записать результат
        // сложения первых двух, вывести третью переменную на экран
        int h;
        int j;
        h = 5;
        j = 875643;
        int sum1 = h + j;
        System.out.println("h + j = " + sum1);

        // Объявить переменную типа int, присвоить ей значение, затем присвоить еще раз другое значение и  вывести его на экран
        int w = 8;
        w = 99;
        System.out.println("int = " + w);

    }
}