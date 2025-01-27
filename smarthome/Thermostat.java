package com.inheritancequestions.single.smarthome;

public class Thermostat extends Device{
    String temperatureSetting;

    public String getTemperatureSetting() {
        return temperatureSetting;
    }

    public void setTemperatureSetting(String temperatureSetting) {
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting "+ temperatureSetting);
    }
}
