package ru.sberhealth.rgs;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PalindromeCheck palindromeCheck = new PalindromeCheck();

        System.out.println("Please enter your palindrome number");
        Scanner scanner =  new Scanner(System.in);
        int number = scanner.nextInt();

        boolean isPalindromeCheck = palindromeCheck.isPalindrome(number);

        if(isPalindromeCheck){
            System.out.println(number + " This is palindrome");
        }else
            System.out.println(number + " This is NOT the palindrome");


        String romanNumber = "IX";
        RomaRomaRoman romaRomaRoman = new RomaRomaRoman();
        int result = romaRomaRoman.arabicToRomanNumbers(romanNumber);
        System.out.println(result);
    }
}
