package ru_mirea_lab6;

public class TestPrice {
    public static void main(String[] args) {
        Priceable[] items = {
                new Product("Ноутбук", 79990.99),
                new Car("Chevrolet Tahoe", 5000000.0),
        };

        for (Priceable item : items) {
            System.out.println(item.toString() + "стоит: " + item.getPrice() + " руб.");
        }
    }
}
