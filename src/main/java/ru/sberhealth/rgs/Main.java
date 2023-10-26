package ru.sberhealth.rgs;

import java.util.Scanner;

public class Main extends MethodsHomeWork{

    public static void main(String[] args){

        // task 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name please");
        String nameInput = scanner.nextLine();

        System.out.println("Enter your age please");
        int ageInput = scanner.nextInt();

        userDataGet(nameInput, ageInput);


        // task 2
        System.out.print("Enter your birth year please in format - 'xxxx': ");
        int yearOfBirthInput = scanner.nextInt();

        ageCalculation(yearOfBirthInput);

        // task 3
        unitStrings("Big", "CocoJamba");

        // task 4
        stringToInt("555");

        // task 5
        System.out.println("Enter your double-burble num");
        Scanner getStringDouble = new Scanner(System.in);
        String valueOfLeatherBagInput = getStringDouble.nextLine();

        stringToDouble(valueOfLeatherBagInput);

        /*
        // task 6
        System.out.println("Enter double num");
        Scanner getDouble = new Scanner(System.in);
        double newDoubleInput = getDouble.nextDouble();
        doubleRoundToInt(newDoubleInput);
        */

        // task 7
        mathCumbackToSchool();


    }

}
