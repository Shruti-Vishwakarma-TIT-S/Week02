package com.inheritancequestions.multilevel.onlineretail;

public class DeliveredOrder extends ShippedOrder{
    String deliveryDate ;
    DeliveredOrder(int orderId, String orderDate, long trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery Date "+ deliveryDate);
        System.out.println("Status is on the way");
    }
}
