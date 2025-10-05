package ru_mirea_lab8;

public class n7 {
    public static void Razloshenie(int n, int divisor) {
        if (n == 1) {
            return;
        }

        if (n % divisor == 0) {
            System.out.println(divisor);
            Razloshenie(n / divisor, divisor);
        } else {
            Razloshenie(n, divisor + 1);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Разложение на простые множители числа " + n + ": ");
        Razloshenie(n, 2);
    }
}
