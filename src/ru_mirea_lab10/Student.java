package ru_mirea_lab10;

public class Student {
    private String firstName;
    private String lastName;
    private String speciality;
    private int course;
    private String group;
    private double averageGrade;

    public Student(String firstName, String lastName, String speciality, int course, String group, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getSpeciality() {return speciality;}
    public void setSpeciality(String speciality) {this.speciality = speciality;}

    public int getCourse() {return course;}
    public void setCourse(int course) {this.course = course;}

    public String getGroup() {return group;}
    public void setGroup(String group) {this.group = group;}

    public double getAverageGrade() {return averageGrade;}
    public void setAverageGrade(double averageGrade) {this.averageGrade = averageGrade;}

    @Override
    public String toString() {
        return String.format("%s %s, %s, Курс %d, Группа %s, Средний балл: %.2f", firstName, lastName, speciality, course, group, averageGrade);
    }
}
