package ru.sberhealth.rgs;

public class Good {
    public static int amountOfGoods = 0;

    private String name;
    private int price;

    public Good(String name, int price) {
        this.name = name;
        this.price = price;
        amountOfGoods++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void printHello(){
        System.out.println("Hello!");
    }
}
