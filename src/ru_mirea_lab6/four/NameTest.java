package ru_mirea_lab6.four;

public class NameTest {
    public static void main(String[] args) {
        Nameable[] things = {
                new Planet("Земля"),
                new Transport("Chevrolet"),
                new Animal("Слон")
        };

        for (Nameable thing : things) {
            System.out.println("Имя: " + thing.getName());
        }
    }
}
