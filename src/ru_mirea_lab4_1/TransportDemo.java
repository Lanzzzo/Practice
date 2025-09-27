package ru_mirea_lab4_1;

public class TransportDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(),
                new Airplane(),
                new Train(),
                new Ship()
        };

        Car car = new Car();
        car.printInfo(100, 3, 1.75);

        Airplane airplane = new Airplane();
        airplane.printInfo(1200, 100, 80);

        Train train = new Train();
        train.printInfo(450, 900, 150);

        Ship ship = new Ship();
        ship.printInfo(1450, 375, 1250);
    }
}
