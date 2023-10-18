package ru.sbrehealth.rgs;


public class Variables {

    public static final String pussy = "juicy ";
    public static final int county = 69;

    public static void main(String[] args) {

        // Объявить переменную типа int, присвоить ей значение, вывести на экран в терминале

        int darkSoul = 1;
        System.out.println(darkSoul);


        // Объявить переменную типа String, присвоить ей значение, вывести на экран в терминале

        String nameOfThatSoul = "Soul Name";
        System.out.println(nameOfThatSoul);

        // Объявить две переменные типа int, вывести на экран в терминале их сумму

        int one = 1;
        int notOne = 9;

        System.out.println("The sum is " + Integer.sum(one,notOne));

        // Объявить две переменные типа int, вывести на экран в терминале их разность

        int two = 2;
        int notTwo = 9;

        System.out.println(two - notTwo);

        // Объявить две переменные типа int, вывести на экран их произведение

        int three;
        three = 3;
        int notThree = 33;
        System.out.println(notThree * three);

        // Объявить две переменные типа double, вывести на экран в терминале результат деления первой на вторую


        double glucoseMorning = 7.3;
        double glucoseEvening = 9.1;
        double result = (glucoseEvening / glucoseMorning);

        System.out.println(result);

        // Объявить переменную типа boolean, вывести на экран в терминале ее значение

        boolean thereOnly2GendersExist = false;
        System.out.println(thereOnly2GendersExist);


        // Объявить две переменные типа String (например "Эта строка из " и " слов") и одну переменную типа int (например 4) и склеить их таким образом,
        // чтобы получилась фраза

        int age = 18;
        String myAge = "I'm ";
        String possibility = " and I can drink all shit all night and fuck whores at the same time";

        System.out.println(myAge + age + possibility);

        // Объявить константу типа String и константу типа int и вывести на экран в терминале их сумму, чтобы получилась фраза

        System.out.println(pussy + county);

        // Объявить две переменные типа int и проиницализировать их значениями, объявить третью переменную, в нее записать результат
        // сложения первых двух, вывести третью переменную на экран

        int cockLength = (int)(Math.random() * 10000);
        int handLengthSm = 35;
        int cockAndHandLengthSum = cockLength + handLengthSm;
        System.out.println(cockAndHandLengthSum);


        // Объявить переменную типа int, присвоить ей значение, затем присвоить еще раз другое значение и  вывести его на экран

        int yearsInIT = 1;
        yearsInIT = 2;
        System.out.println(yearsInIT);

    }
}
