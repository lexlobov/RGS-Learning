package ru.sberhealth.rgs;

import java.util.HashMap;
import java.util.Map;

public class RomaRomaRoman {

    public int arabicToRomanNumbers(String romanNumber){

        Map <Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        int arabicNumber = 0;

        for (int i = 0; i < romanNumber.length(); i++) {

            if(i > 0 && numbersMap.get(romanNumber.charAt(i)) > numbersMap.get(romanNumber.charAt(i -1))){
                arabicNumber += numbersMap.get(romanNumber.charAt(i)) - 2 * numbersMap.get(romanNumber.charAt(i - 1));
            }else
                arabicNumber += numbersMap.get(romanNumber.charAt(i));

        }
        return arabicNumber;
    }

}
