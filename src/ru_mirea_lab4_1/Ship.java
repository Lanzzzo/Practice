package ru_mirea_lab4_1;

public class Ship extends Vehicle {

    public Ship() {
        super("Корабль", 60, 7, 6);
    }

    @Override
    public double calculatePassengerCost(int passengers, double distance) {
        return passengers * distance * getPassengerPrice();
    }

    @Override
    public double calculateCargoCost(double cargoWeight, double distance) {
        return cargoWeight * distance * getCargoPrice();
    }
}
