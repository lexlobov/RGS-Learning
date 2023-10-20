package ru.sbrehealth.rgs;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Variables {

    public static void main(String[] args) {

        // Объявить переменную типа int, присвоить ей значение, вывести на экран в терминале

        int a;
        a = 1;
        System.out.println(a);

        // Объявить переменную типа String, присвоить ей значение, вывести на экран в терминале

        String b;
        b = "Two";
        System.out.println(b);

        // Объявить две переменные типа int, вывести на экран в терминале их сумму

        int c;
        c = 3;
        int d;
        d = 4;
        System.out.println(c+d);

        // Объявить две переменные типа int, вывести на экран в терминале их разность

        int e;
        e = 10;
        int f;
        f = 5;
        System.out.println(e-f);

        // Объявить две переменные типа int, вывести на экран их произведение

        int g;
        g = 6;
        int h;
        h = 7;
        System.out.println(g*h);

        // Объявить две переменные типа double, вывести на экран в терминале результат деления первой на вторую

        double i;
        i = 8;
        double j;
        j = 9;
        System.out.println(i/j);

        // Объявить переменную типа boolean, вывести на экран в терминале ее значение

        boolean k;
        k = true;
        System.out.println(k);

        // Объявить две переменные типа String (например "Эта строка из " и " слов") и одну переменную типа int (например 4) и склеить их таким образом,
        // чтобы получилась фраза

        String l;
        l = "Я съел ";
        String m;
        m = " котлеты";
        int n;
        n = 2;
        System.out.println(l+n+m);

        // Объявить константу типа String и константу типа int и вывести на экран в терминале их сумму, чтобы получилась фраза

        final String o;
        o = " стульев";
        final int p;
        p = 12;
        System.out.println(p+o);

        // Объявить две переменные типа int и проиницализировать их значениями, объявить третью переменную, в нее записать результат
        // сложения первых двух, вывести третью переменную на экран

        int q = 13;
        int r = 14;
        int s;
        s = q+r;
        System.out.println(s);

        // Объявить переменную типа int, присвоить ей значение, затем присвоить еще раз другое значение и  вывести его на экран

        int t;
        t = 15;
        t = 16;
        System.out.println(t);

    }
}
