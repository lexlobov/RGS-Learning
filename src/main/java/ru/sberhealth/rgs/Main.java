package ru.sberhealth.rgs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Roman someRoman = new Roman();
        String romanNumber = "CMLXXXIII";
        int result = someRoman.arabicToRomanNumbers(romanNumber);
        System.out.println(result);

        Polindrom polindromCheck = new Polindrom();
        System.out.println(polindromCheck.isPalindrome(123421));
    }
}