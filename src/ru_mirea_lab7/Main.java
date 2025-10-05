package ru_mirea_lab7;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(0, 0, 5, -5, 2, 2);


        System.out.println(rect);
        System.out.println("Тест скорости: " + rect.speedTest());

        rect.moveUp();
        rect.moveRight();
        System.out.println("\nПосле передвижения:");
        System.out.println(rect);
    }
}
