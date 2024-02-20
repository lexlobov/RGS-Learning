package ru.sbrehealth.rgs;

public class Variables {

    public static void main(String[] args) {

        // Объявить переменную типа int, присвоитnь ей значение, вывести на экран в терминале

        int theFirst = 0;
        System.out.println(theFirst);

        // Объявить переменную типа String, присвоить ей значение, вывести на экран в терминале

        String song = "Feeling good";
        System.out.println(song);

        // Объявить две переменные типа int, вывести на экран в терминале их сумму

        int one = 1;
        int two = 2;
        System.out.println(one + two);

        // Объявить две переменные типа int, вывести на экран в терминале их разность

        int three = 3;
        int four = 4;
        System.out.println(four - three);

        // Объявить две переменные типа int, вывести на экран их произведение

        int five = 5;
        int six = 6;
        System.out.println(five * six);

        // Объявить две переменные типа double, вывести на экран в терминале результат деления первой на вторую
//        double

        double more = 7.333333333333333;
        double less = 1.1;
        System.out.println(more / less);

        // Объявить переменную типа boolean, вывести на экран в терминале ее значение

        boolean understanding = false;
        System.out.println(understanding);

        // Объявить две переменные типа String (например "Эта строка из " и " слов") и одну переменную типа int (например 4) и склеить их таким образом,
        // чтобы получилась фраза

        String first = "-е сентября - ";
        String second = "день прощанья! ";
        int number = 3;

        System.out.println(number + first + second);


        // Объявить константу типа String и константу типа int и вывести на экран в терминале их сумму, чтобы получилась фраза

        final String selebrate = "С наступающим ";
        final int men = 23;
        String finish = " февраля!";
        /*
        selebrate = "Поздравляю с ";
        - это я проверяла, что ошибочку выдаст
         */
        System.out.println(selebrate + men + finish);

        // Объявить две переменные типа int и проиницализировать их значениями, объявить третью переменную, в нее записать результат
        // сложения первых двух, вывести третью переменную на экран

        int numberOne;
        numberOne = 10;
        int numberTwo = 7;
        int result = (numberOne + numberTwo);
        System.out.println(result);

        // Объявить переменную типа int, присвоить ей значение, затем присвоить еще раз другое значение и  вывести его на экран

        int ezhik;
        ezhik = 2;
        ezhik = 1;
        System.out.print(ezhik);

    }
}
