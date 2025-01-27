package com.inheritancequestions.multilevel.education;

public class OnlineCourse extends Course{
    String platform ;
    boolean isRecorded;
    OnlineCourse(String course, int duration, String platform, boolean isRecorded){
        super(course, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    public void display(){
        super.display();
        System.out.println("Platform "+ platform+ "\nIs Recorded "+ isRecorded);
    }

}
