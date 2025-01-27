package com.encapsulation.ridehailing;

// Interface representing GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}