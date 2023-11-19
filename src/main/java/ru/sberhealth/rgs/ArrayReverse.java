package ru.sberhealth.rgs;

public class ArrayReverse {

    public static Object [] reverseArray(Object [] array){
        for (int i = 0; i < array.length; i++) {
            Object temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;
    }
}
