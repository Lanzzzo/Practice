package ru_mirea_lab6;

public class TemperatureConverter {
    private Convertable temperature;

    public TemperatureConverter(Convertable temperature) {
        this.temperature = temperature;
    }

    public void displayAllConversions() {
        double kelvin = temperature.convert("kelvin");
        double fahrenheit = temperature.convert("fahrenheit");


        System.out.println(temperature);
        System.out.printf("В Кельвинах: %.2fK%n", kelvin);
        System.out.printf("В Фаренгейтах: %.2f°F%n", fahrenheit);
        System.out.println("---------------");
    }
}
