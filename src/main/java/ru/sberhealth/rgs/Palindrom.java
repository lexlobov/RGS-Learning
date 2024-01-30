package ru.sberhealth.rgs;

import java.util.Scanner;

public class Palindrom {

    // Задание 2
    // Написать метод, который будет принимать на вход целое число и проверять, что это число является палиндромом. Палиндром -
    // значит, что число читается слева направо и справа налево одинаково, например 1221 с обеих сторон читается как 1221.
    // Метод должен возвращать true, если число является палиндромом, и false, если нет.
    public boolean isPalindrome(int num) {
        String numStr = String.valueOf(num);
        int length = numStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrom checker = new Palindrom();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if (checker.isPalindrome(number)) {
            System.out.println(number + " true ");
        } else {
            System.out.println(number + " false ");
        }
    }
}

