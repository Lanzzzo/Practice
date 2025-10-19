package ru_mirea_lab9;

public class Sorting {
    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable current = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].compareTo(current) > 0) {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = current;
        }
    }
}
