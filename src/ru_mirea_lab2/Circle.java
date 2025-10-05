package ru_mirea_lab2;

public class Circle {
    private double r; //radius

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {return r;}
    public void setR(double r) {this.r = r;}

    public double FindArea() {
        return Math.PI * r * r;
    }

    public double FindLength() {
        return 2*Math.PI * r;
    }

    public boolean Equal(Circle other) {
        return this.r == other.r;
    }

    @Override
    public String toString() {
        return String.format("Окружность r = %.2f", r);
    }
}
