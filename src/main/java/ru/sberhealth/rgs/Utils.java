package ru.sberhealth.rgs;

public class Utils {

    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static String concatenateStrings(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Среднее арифметическое: " + calculateAverage(numbers));

        String result = concatenateStrings("Hello", ", ", "world", "!");
        System.out.println("Результат склеивания строк: " + result);

        System.out.println("Сумма элементов массива: " + calculateSum(numbers));
    }
}