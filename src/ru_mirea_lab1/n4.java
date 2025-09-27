package ru_mirea_lab1;
import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] sp = new int[size];
        System.out.print("Введите элементы массива: ");

        for (int i = 0; i < sp.length; i++) {
            sp[i] = scanner.nextInt();
        }

        int sum = 0;
        int i = 0;
        int mn = 10 * 10 ^ 21;
        int mx = 0;

        do {
            sum += sp[i];
            i++;
        } while (i < sp.length);

        int c = 0;
        while (c < sp.length) {
            if (mx < sp[c]) {
                mx = sp[c];
            }
            if (mn > sp[c]) {
                mn = sp[c];
            }
            c++;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Min: " + mn);
        System.out.println("Max: " + mx);


    }
}


