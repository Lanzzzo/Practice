//Задание 1.3

package ru_mirea_lab3;

import java.util.Arrays;
import java.util.Random;
public class task1 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] mass1 = new int[4];

        for (int i = 0; i < mass1.length; i++) {
            int r = rand.nextInt(10, 100);
            mass1[i] = r;
        }

        System.out.println(Arrays.toString(mass1));
        boolean flag = true;
        for (int i = 1; i < mass1.length; i++) {
            if (mass1[i] <= mass1[i - 1]) {
                flag = false;
                break;
            }

        }

        if (flag == true) {System.out.println("Строго возрастающая последовательность");}
        else {System.out.println("Не является строго возрастающей последовательностью");}

    }
}
