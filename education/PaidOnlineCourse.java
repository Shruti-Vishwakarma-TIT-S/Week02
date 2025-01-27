package com.inheritancequestions.multilevel.education;

import com.inheritancequestions.multilevel.onlineretail.ShippedOrder;

public class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    public void display(){
        super.display();
        System.out.println("Fee "+ fee+ "\nDiscount "+ discount);
    }
}
