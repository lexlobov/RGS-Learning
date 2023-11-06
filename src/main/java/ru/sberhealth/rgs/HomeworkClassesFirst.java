package ru.sberhealth.rgs;

import java.util.Scanner;

public class HomeworkClassesFirst {

       public static void main(String[] args) {

           // создаем новый экземпляр класса Авто
           Car carOne = new Car("Bugatti", 123.22);
           System.out.println(carOne);


           // создаем экземпляр класса сканер
           Scanner scanner = new Scanner(System.in);
           // создаем новый экземпляр класса Авто
           Car carTwo = new Car();

           // Запрашиваем ввод модели и сетаем ее в model класса Car
           System.out.println("Enter your car model: ");
           String myModel = scanner.nextLine();
           carTwo.setModel(myModel);

           // Запрашиваем ввод лс и сетаем ее в horsePower класса Car
           System.out.println("Enter your car Horse Power: ");
           double myCarHorsePower = scanner.nextDouble();
           carTwo.setHorsePower(myCarHorsePower);

           // Запрашиваем ввод тип авто, в зависимости от ответа используем и сетаем тот или иной енам
           System.out.println("Choose your car type: 1 for passenger, 2 for truck -  ");
           int myCarType = scanner.nextInt();
           if(myCarType == 1){
               carTwo.setCarType(CarTypes.PASSENGER);
           }else carTwo.setCarType(CarTypes.TRUCK);


           // Запрашиваем ввод кол-ва колес авто и сетаем в wheels класса Car
           System.out.println("Enter the number of wheels of your car: ");
           int myCarNumberOfWheels = scanner.nextInt();
           carTwo.setWheels(myCarNumberOfWheels);

           System.out.println(carTwo);

           System.out.println("First car type: " + carOne.getCarType() + "\n" +
                              "Second car model: " + carTwo.getModel());
       }

}
