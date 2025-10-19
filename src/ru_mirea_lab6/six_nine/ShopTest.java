package ru_mirea_lab6.six_nine;

public class ShopTest {
    public static void main(String[] args) {
        Printable[] items = {
                new Book("Братья Карамазовы"),
                new Shop("Книжный магазин"),
                new Book("Белая гвардия"),
                new Shop("Книжный прилавок")
        };

        for (Printable item : items) {
            item.print();
        }
    }
}
