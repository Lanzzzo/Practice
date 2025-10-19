package ru_mirea_lab10;

import javax.swing.*;
import java.util.*;
import java.util.Arrays;


public class SortingStudentsByGPA {
    private List<Student> iDNumber;

    public void setArray(List<Student> students) {
        this.iDNumber = new ArrayList<>(students);
    }

    public void quicksort() {
        quicksort(0, iDNumber.size() - 1);
    }

    private void quicksort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quicksort(low, pi - 1);
            quicksort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        Student pivot = iDNumber.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (iDNumber.get(j).getAverageGrade() > pivot.getAverageGrade()) {
                i++;
                Collections.swap(iDNumber, i, j);
            }
        }
        Collections.swap(iDNumber, i + 1, high);
        return i+1;
    }

    public void mergesort() {
        iDNumber = mergesort(iDNumber);
    }

    private List<Student> mergesort(List<Student> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;
        List<Student> left = mergesort(new ArrayList<>(list.subList(0, mid)));
        List<Student> right = mergesort(new ArrayList<>(list.subList(mid, list.size())));

        return merge(left, right);
    }

    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getAverageGrade() >= right.get(j).getAverageGrade()) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }

    public void sortByOtherField(Comparator<Student> comparator) {
        iDNumber.sort(comparator);
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иван", "Петров", "Информатика", 2, "КВБО-12-23", 4.3),
                new Student("Мария", "Иванова", "Математика", 1, "ИРБО-11-25", 4.7),
                new Student("Алексей", "Сидоров", "Физика", 3, "КББО-21-24", 3.1)
        );

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(students);

        System.out.println("Исходный список: ");
        sorter.outArray();

        System.out.println("\nПосле быстрой сортировки по среднему баллу: ");
        sorter.quicksort();
        sorter.outArray();

        System.out.println("\nПосле сортировки слиянием по среднему баллу: ");
        sorter.mergesort();
        sorter.outArray();

        System.out.println("\nСортмровка по имени");
        sorter.sortByOtherField(Comparator.comparing((Student::getFirstName)));
        sorter.outArray();
    }
}
