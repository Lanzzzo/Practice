package ru_mirea_lab3;

public class converterTest {
    public static void main(String[] args) {
        converter conv = new converter();

        double usdAmount = 100.0;
        double eurAmount = conv.convertUsdToEur(usdAmount);
        double rubAmount = conv.convertUsdToRub(usdAmount);

        System.out.println(usdAmount + " USD = " + eurAmount + " EUR");
        System.out.println(usdAmount + " USD = " + rubAmount + " RUB");
    }
}
