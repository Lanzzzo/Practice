package ru_mirea_lab6;

public class TempTest {
    public static void main(String[] args) {
        Temperature[] temperatures = {
                new Temperature(0),
                new Temperature(100),
                new Temperature(20),
                new Temperature(-40),
                new Temperature(37)
        };

        for (Temperature temp : temperatures) {
            TemperatureConverter converter = new TemperatureConverter(temp);
            converter.displayAllConversions();
        }
    }
}
