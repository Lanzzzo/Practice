package ru_mirea_lab4_1;

public class Train extends Vehicle {

    public Train() {
        super("Поезд", 120, 3, 4);
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
