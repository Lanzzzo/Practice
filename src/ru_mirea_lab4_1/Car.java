package ru_mirea_lab4_1;

public class Car extends Vehicle {
    private static final double MAX_CARGO = 2.5;

    public Car() {
        super("Автомобиль", 90, 5, 8);
    }

    @Override
    public double calculatePassengerCost(int passengers, double distance) {
        return passengers * distance * getPassengerPrice();
    }

    @Override
    public double calculateCargoCost(double cargoWeight, double distance) {
        if (cargoWeight > MAX_CARGO) {
            System.out.println("Превышение максимальной грузоподъемности автомобиля ("+ MAX_CARGO + " т)!");
            return 0;
        }
        return cargoWeight * distance * getCargoPrice();
    }

    public double getMaxCargo() {
        return MAX_CARGO;
    }
}
