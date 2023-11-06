package ru.sberhealth.rgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyStaticMethods {
    public static double getAvgResult() {
        Scanner scanner = new Scanner(System.in);

        // Новый список arr
        List<Integer> arr = new ArrayList<>();

        // Пока вводим инт - продолжаем запрашивать числа и записывать значение test в список
        // Если ввели quit - завершаем цикл
        while (true) {

            System.out.println("Enter your integers (or quit to exit): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                break;
            } else {
                int test = Integer.parseInt(userInput);
                arr.add(test);
            }
        }

        // Приводим значения клс Integer к примитиву int, получаем среднее арифметическое и отдаем как double
        return arr.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }
}




