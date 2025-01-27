package com.inheritancequestions.hierarchical.schoolsystem;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alisha", 30, "Mathematics");
        Student student = new Student("Charu", 16, "10th Grade");
        Staff staff = new Staff("Disha", 40, "Principal");

        System.out.println(teacher.displayRole());
        System.out.println(student.displayRole());
        System.out.println(staff.displayRole());
    }
}