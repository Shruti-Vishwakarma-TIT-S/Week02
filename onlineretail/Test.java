package com.inheritancequestions.multilevel.onlineretail;

public class Test {
    public static void main(String[] args) {
        DeliveredOrder deliveredOrder = new DeliveredOrder(12345, "24-01-2025", 987654321L, "25-01-2025");
        deliveredOrder.getOrderStatus();

    }
}
