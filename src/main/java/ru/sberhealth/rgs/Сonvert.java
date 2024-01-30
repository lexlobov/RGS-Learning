package ru.sberhealth.rgs;

import java.util.HashMap;
import java.util.Map;

public class Сonvert {

    // Задание 1
    // Написать метод, который будет конвертировать римские цифры в арабские. На вход должна приниматься строка
    // содержащая значение в римском формате (например 'XIX'). На выход должно выдаваться число, которое будет
    // равно значению (в данном случае 19). Нужно учитывать, что у римских цифр есть правило, что подряд не может быть более
    // трех одинаковых символов, например число 4 будет выражено не как IIII, а как IV, число 9 - IX, а не VIIII.
    // Значения римских цифр

    private static final Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static int convertRomanToArabic(String romanNumber) {
        int arabicNumber = 0;
        int count = 1;
        for (int i = 0; i < romanNumber.length(); i++) {
            int currentDigit = getValue(romanNumber.charAt(i));
            if (i + 1 < romanNumber.length()) {
                int nextDigit = getValue(romanNumber.charAt(i + 1));
                if (currentDigit >= nextDigit) {
                    arabicNumber += currentDigit;
                } else {
                    if (count >= 4) {
                        throw new IllegalArgumentException("Некорректное значение: " + romanNumber);
                    }
                    arabicNumber += (nextDigit - currentDigit);
                    i++;
                }
                count = currentDigit == nextDigit ? count + 1 : 1;
            } else {
                arabicNumber += currentDigit;
            }
        }
        if (count >= 4) {
            throw new IllegalArgumentException("Некорректное значение: " + romanNumber);
        }
        return arabicNumber;
    }

    public static int getValue(char romanNumeral) {
        if (!romanMap.containsKey(romanNumeral)) {
            throw new IllegalArgumentException("Некорректное значение: " + romanNumeral);
        }
        return romanMap.get(romanNumeral);
    }

    public static void main(String[] args) {
        String romanNumber = "IIII";
        int arabicNumber = convertRomanToArabic(romanNumber);
        System.out.println(romanNumber + " = " + arabicNumber);
    }

}




