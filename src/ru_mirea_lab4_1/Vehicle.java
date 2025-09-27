package ru_mirea_lab4_1;

public abstract class Vehicle {
    protected String name;
    protected double speed;
    protected double passengerPrice;
    protected double cargoPrice;

    public Vehicle(String name, double speed, double passengerPrice, double cargoPrice) {
        this.name = name;
        this.speed = speed;
        this.passengerPrice = passengerPrice;
        this.cargoPrice = cargoPrice;
    }

    public double calculateTime(double distance) {
        return distance / speed;
    }

    public abstract double calculatePassengerCost(int passengers, double distance);
    public abstract double calculateCargoCost(double cargoWeight, double distance);

    public void printInfo(double distance, int passengers, double cargoWeight) {
        System.out.println("\n" + name + ":");
        System.out.printf("Время преодоления расстояния %.2f ч\n", calculateTime(distance));
        System.out.printf("Стоимость перевозки %d пассажиров: %.2f руб.\n", passengers, calculatePassengerCost(passengers, distance));
        System.out.printf("Стоимость перевозки %.1f тонн груза: %.2f руб.\n", cargoWeight, calculateCargoCost(cargoWeight, distance));
    }

    public String getName() {return name;}
    public double getSpeed() {return speed;}
    public double getPassengerPrice() {return passengerPrice;}
    public double getCargoPrice() {return cargoPrice;}
}
