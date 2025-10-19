package ru_mirea_lab9;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGpa(), s2.getGpa());
    }

    public void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private int partition(Student[] students, int low, int high) {
        Student pivot = students[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students[j], pivot) > 0) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);
        return i+1;
    }

    private void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
}

