package ru.sberhealth.rgs;

import java.util.Scanner;
import  ru.sberhealth.rgs.Homework;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of Fibbonachi iterations: ");

        int iterations = scanner.nextInt();

        int result = Homework.getSumResult(iterations);
        System.out.println(result);
    }


}
