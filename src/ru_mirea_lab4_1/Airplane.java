package ru_mirea_lab4_1;

public class Airplane extends Vehicle {
    private static final double MIN_DISTANCE = 200;

    public Airplane () {
        super("Самолет", 800, 10, 50);
    }

    @Override
    public double calculatePassengerCost(int passengers, double distance) {
        if (distance < MIN_DISTANCE) {
            System.out.println("Самолет не летает на дистанции менее " + MIN_DISTANCE + "км!");
            return 0;
        }
        return passengers * distance * getPassengerPrice();
    }

    @Override
    public double calculateCargoCost(double cargoWeight, double distance) {
        if (distance < MIN_DISTANCE) {
            System.out.println("Самолет не летает на дистанции менее " + MIN_DISTANCE + "км!");
            return 0;
        }
        return cargoWeight * distance * getCargoPrice();
    }

    public double getMinDistance() {
        return MIN_DISTANCE;
    }
}
