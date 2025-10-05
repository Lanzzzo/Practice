package ru_mirea_lab8;

public class n8 {
    public static String Palindrom(String s) {
        if (s.length() <= 1) {
            return "YES";
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return "NO";
        }

        return Palindrom(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String[] Words = {"anna", "level", "test", "a", "hello"};

        System.out.println("Являютя ли палиндромами?\n");
        for (String word : Words) {
            System.out.println("Слово " + word +": "+ Palindrom(word));
        }
    }
}


