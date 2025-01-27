package com.inheritancequestions.single.smarthome;

public class Device {
    int deviceId ;
    String status;

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void displayStatus()
    {
        System.out.println("Device Id "+ deviceId);
        System.out.println("Status  is "+ status);
    }
}
