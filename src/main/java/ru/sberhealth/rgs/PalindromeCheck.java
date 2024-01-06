package ru.sberhealth.rgs;

public class PalindromeCheck {

    public boolean isPalindrome(int number){

        int originalNum = number;
        int reverseNum = 0;

        while (number > 0){

            int digit = number % 10;
            reverseNum = reverseNum * 10 + digit;
            number = number / 10;

        }
        return reverseNum == originalNum;
    }
}
