package com.inheritancequestions.single.smarthome;

public class Test {
    public static void main(String[] args) {
        Device d  = new Device();
        d.setDeviceId(5369);
        d.setStatus("Working");
        d.displayStatus();
        Thermostat t = new Thermostat();
        t.setDeviceId(4658);
        t.setStatus("Not working");
        t.setTemperatureSetting("Moderate");
        t.displayStatus();
    }
}
