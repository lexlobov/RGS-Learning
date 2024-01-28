package ru.sberhealth.rgs;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    public int arabicToRomanNumbers(String romanNumber){

        Map<Character, Integer> romansNumber = new HashMap<>();
        romansNumber.put('I', 1);
        romansNumber.put('V', 5);
        romansNumber.put('X', 10);
        romansNumber.put('L', 50);
        romansNumber.put('C', 100);
        romansNumber.put('D', 500);
        romansNumber.put('M', 1000);

        int arabic = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            if(i > 0 && romansNumber.get(romanNumber.charAt(i)) > romansNumber.get(romanNumber.charAt(i -1))){
                arabic += romansNumber.get(romanNumber.charAt(i)) - 2 * romansNumber.get(romanNumber.charAt(i - 1));
            }else
                arabic += romansNumber.get(romanNumber.charAt(i));
        }
        return arabic;
    }
}
