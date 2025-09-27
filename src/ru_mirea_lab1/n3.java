package ru_mirea_lab1;

public class n3 {
    public static void main(String[] args) {
        int[] a = {0, 10, 3, 5, 1};
        int sum = 0;
        int ar = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        ar = (sum) / (a.length);
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее ар: " + ar);
    }
}

