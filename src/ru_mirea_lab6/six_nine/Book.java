package ru_mirea_lab6.six_nine;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }


    @Override
    public void print() {
        System.out.println("Книга: " + title);
    }
}
