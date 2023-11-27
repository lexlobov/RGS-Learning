package ru.sberhealth.rgs;

public class Main {

    public static void main(String[] args) {

        // простое условие со словом if
        if ((1 + 1) == 2){
            System.out.println("Этот кусок кода выполнится");
        }

        // условие, которое будет проигнорировано
        if (1 > 2) {
            System.out.println("Этот кусок кода будет проигнорирован, и эта строка не будет выведена в консоль");
        }

        // условие с альтернативой с использованием else
        if (1 > 2) {
            System.out.println("Этот кусок кода будет проигнорирован, и эта строка не будет выведена в консоль");
        } else {
            System.out.println("В данном случае этот кусок кода выполнится, и эта строка выведется на консоль");
        }

        // условие с несколькими альтернативами
        int number = 3;
        if (number == 1){
            System.out.println("Это условие проигнорируется");
        } else if (number == 2) {
            System.out.println("Это условие также проигнорируется");
        } else {
            System.out.println("А вот это условие выполнится");
        }

        boolean expression1 = 1 > 0; // значение этого выражение равно true
        boolean expression2 = 2 > 1; // значение этого выражения равно true
        boolean expression3 = expression1 && expression2; // and значение этого выражения равно true, так как значение обоих операндов равно true

        boolean expression4 = 1 < 0; // значение этого выражения равно false
        boolean expression5 = expression1 && expression4; // значение этого выражения будет равно false, так как значение expression4 равно false

        boolean expression6 = expression1 || expression4; // or значение этого выражения будет равно true, так как expression1 равно true

        boolean expression7 = expression5 || expression4; // значение этого будет равно false, так как оба expression4 и expression5 равны false
        boolean expression8 = !expression1; // not значение будет равно false, так как изначальное значение expression1 было true, а после применения логического НЕ стало false

        // использование логических операций в условии
        int a = 1;
        int b = 2;
        if (a > 0 && b > 0) {
            // что-то будет сделано
        }

        if (a < 0 || b > 0){
            // что-то будет сделано
        }


        // выведет в консоль сообщение "Плохое настроение"
        System.out.println(getMood("Дождливо"));


        String name = "John";
        String result;
        if (name.equals("John")) {
            result = "Пользователя зовут " + name;
        } else {
            result = "Пользователя зовут не John, а " + name;
        }
        System.out.println(result);
        // результат идентичен тому, который получится в результате выполнения кода выше

        result = (name.equals("John")) ? "Пользователя зовут " + name : "Пользователя зовут не John, а " + name;

        System.out.println(result);




        Integer[] array = {1, 3, 5};
        sumEverySecondNumber(array);

    }

    public static String getMood(String weather){ // солнечно, игорь, кот
        String answer;
        switch (weather){
            case "Солнечно":
                return "Хорошее настроение";

            case "Дождливо":
                return  "Плохое настроение";

            case "Пасмурно без осадков":
                return  "Среднее настроение";

            default:
                return  "Я такой погоды не знаю";

        }
    }

    // 3
    public static Integer [] sumEverySecondNumber(Integer [] newSecondArrayNumbers){

        for (int i = 0; i < newSecondArrayNumbers.length; i += 2) {
            newSecondArrayNumbers[i] = newSecondArrayNumbers[i] * 2;
        }
        return newSecondArrayNumbers;
    }

    public static int [] sumEverySecondNumber1(Integer [] newSecondArrayNumbers){
        if (newSecondArrayNumbers.length % 2 != 0){
            throw new IllegalArgumentException("Array should be even");
        }


        int [] resultArray = new int [newSecondArrayNumbers.length / 2] ;
        for (int i = 0, j = 0; i < newSecondArrayNumbers.length; i += 2, j ++) {

            resultArray[j] = newSecondArrayNumbers[i] * 2;
        }
        return resultArray;
    }
}
