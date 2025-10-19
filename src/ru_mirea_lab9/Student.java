package ru_mirea_lab9;

public class Student implements Comparable<Student> {
    private int iDnumber;
    private String name;
    private double gpa;

    public Student(int iDNumber, String name, double gpa) {
        this.iDnumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getiDnumber() {return iDnumber;}
    public String getName() {return name;}
    public double getGpa() {return gpa;}

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDnumber, other.iDnumber);
    }

    @Override
    public String toString() {
        return "Student{" + "iDnumber=" + iDnumber +  ", name=" + name + ", gpa=" + gpa + '}';
    }
}


