package com.inheritancequestions.multilevel.onlineretail;

public class ShippedOrder extends Order{
    long trackingNumber ;
    ShippedOrder(int orderId, String orderDate, long trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking number is "+ trackingNumber);
        System.out.println("Order Status is shipped");
    }
}
