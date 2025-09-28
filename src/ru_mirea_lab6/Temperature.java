package ru_mirea_lab6;

public class Temperature implements Convertable {
    private double celcius;

    public Temperature(double celcius) {
        this.celcius = celcius;
    }

    public double getCelcius() {return celcius;}
    public void setCelcius(double celcius) {}

    @Override
    public double convert(String toUnit) {
        switch (toUnit.toLowerCase()) {
            case "kelvin":
                return celcius + 273.15;
            case "fahrenheit":
                return (celcius * 9 / 5) + 32;
            default:
                throw new IllegalArgumentException("Неизвестная единица измерения: " + toUnit);
        }
    }

    @Override
    public String toString() {
        return String.format("Температура: %.2f°C", celcius);
    }
}
