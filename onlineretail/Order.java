package com.inheritancequestions.multilevel.onlineretail;

public class Order {
    private int orderId;
    private String orderDate;
    Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public void getOrderStatus(){
        System.out.println("Order Id "+ orderId+ "\nOrder Date "+ orderDate);
        System.out.println("Order status is Pending");
    }
}
