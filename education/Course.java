package com.inheritancequestions.multilevel.education;

public class Course {
    String courseName;
    int duration;
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    public  void display(){
        System.out.println("Course Name "+ courseName+ "\nDuration "+ duration);
    }
}
