package ru_mirea_lab3;

public class converter {
    private double usdToEurRate;
    private double usdToRubRate;
    private double eurToUsdRate;
    private double rubToUsdRate;

    public converter() {
        this.usdToEurRate = 0.85;
        this.usdToRubRate = 83.0;
        this.eurToUsdRate = 1.17;
        this.rubToUsdRate = 0.01;
    }

    public double convertUsdToEur(double amount) {
        return amount * usdToEurRate;
    }

    public double convertEurToUsd(double amount) {
        return amount * eurToUsdRate;
    }

    public double convertUsdToRub(double amount) {
        return amount * usdToRubRate;
    }

    public double convertRubToUsd(double amount) {
        return amount * rubToUsdRate;
    }

    // Методы для установки курсов
    public void setUsdToEurRate(double rate) {
        this.usdToEurRate = rate;
        this.eurToUsdRate = 1.0 / rate; // Автоматически обновляем обратный курс
    }

    public void setUsdToRubRate(double rate) {
        this.usdToRubRate = rate;
        this.rubToUsdRate = 1.0 / rate; // Автоматически обновляем обратный курс
    }

    // Геттеры для получения текущих курсов
    public double getUsdToEurRate() {
        return usdToEurRate;
    }

    public double getUsdToRubRate() {
        return usdToRubRate;
    }

    public double getEurToUsdRate() {
        return eurToUsdRate;
    }

    public double getRubToUsdRate() {
        return rubToUsdRate;
    }
}
