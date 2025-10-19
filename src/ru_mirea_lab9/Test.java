package ru_mirea_lab9;

public class Test {
    public static void main(String[] args) {
        //Задание1
        Student[] students1 = {
                new Student(103, "Ваня", 3.8),
                new Student(101, "Петя", 3.5),
                new Student(102, "Вася", 4.0)
        };
        Sorting.insertionSort(students1);
        System.out.println("Сортировка вставками по ID");
        for (Student s : students1) System.out.println(s);

        Student[] students2 = {
                new Student(201, "Константин", 3.2),
                new Student(202, "Мария", 3.9),
                new Student(203, "Александр", 3.7)
        };
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students2, 0, students2.length - 1);
        System.out.println("\nБыстрая сортировка по GPA :");
        for (Student s : students2) System.out.println(s);

        //Задание 3
        Student[] list1 = {
                new Student(301, "Михаил", 3.6),
                new Student(303, "Георгий", 3.4)
        };
        Student[] list2 = {
                new Student(304, "Павел", 3.9),
                new Student(302, "Алексей", 3.3)
        };
        Student[] merged = MergeSort.mergeSort(list1, list2);
        System.out.println("\nСортировка слиянием двух списков: ");
        for (Student s : merged) System.out.println(s);
    }
}
