package ru_mirea_lab10;

import java.util.*;

public class MergeStudentsLists {
    public static List<Student> mergeAndSort(List<Student> list1, List<Student> list2, Comparator<Student> comparator) {
        List<Student> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        merged.sort(comparator);
        return merged;
    }

    public static void main(String[] args) {
        List<Student> list1 = Arrays.asList(
                new Student("Иван", "Петров", "Информатика", 2, "КТСО-21-24", 4.5),
                new Student("Антон", "Фролов", "Физика", 1, "ИРБО-23-25", 4.8)
        );

        List<Student> list2 = Arrays.asList(
                new Student("Алексей", "Светлов", "Математика", 2, "КТСО-19-24", 4.2),
                new Student("Ольга", "Кузнецова", "Химия", 1, "ИТСО-11-25", 4.9)
        );

        List<Student> merged = mergeAndSort(list1, list2,
                (s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()));


        System.out.println("Объединенный отсортированный список: ");
        for (Student student : merged) {
            System.out.println(student);
        }
    }
}
