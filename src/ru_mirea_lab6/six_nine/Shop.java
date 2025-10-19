package ru_mirea_lab6.six_nine;

public class Shop implements Printable {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Магазин: " + name);
    }
}
