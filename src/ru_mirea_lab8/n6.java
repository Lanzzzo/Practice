package ru_mirea_lab8;

public class n6 {
    public static String IsPrime(int n, int divisor) {
        if (n < 2) {
            return "NO";
        }
        if (divisor * divisor > n) {
            return "YES";
        }
        if (n % divisor == 0) {
            return "NO";
        }

        return IsPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        int n = 17;
        System.out.println(IsPrime(n, 2));
    }
}
