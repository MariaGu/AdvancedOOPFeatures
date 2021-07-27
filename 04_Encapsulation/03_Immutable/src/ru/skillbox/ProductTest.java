package ru.skillbox;

public class ProductTest {
    public static void main(String[] args) {
        Product milk = new Product("milk", 585545855 );
        System.out.println(milk.getName());
        System.out.println(milk.getBarCode());
        milk.setPrice(585);
        System.out.println(milk.getPrice());
    }
}
