package ru_mirea_lab2;

public class PitomnikSobak {
    private Dog[] dogs;
    private int count;

    public PitomnikSobak() {
        this.dogs = new Dog[10];
        this.count = 0;
    }

    public void addDogs(Dog... dogsToAdd) {
        for (Dog dog : dogsToAdd) {
            if (count < dogs.length) {
                dogs[count] = dog;
                count++;
            } else {
                System.out.println("Питомник заполнен.");
            }
        }
    }

    public static void main(String[] args) {
        PitomnikSobak pitomnik = new PitomnikSobak();

        pitomnik.addDogs(
                new Dog("Rex", 3),
                new Dog("Fenrir", 5),
                new Dog("Mumu", 2)
        );

        for (int i = 0; i < pitomnik.count; i++) {
            System.out.println((i + 1) + ". " + pitomnik.dogs[i].toString());
        }
    }
}
