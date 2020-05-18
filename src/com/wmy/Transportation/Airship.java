package com.wmy.Transportation;

public class Airship extends AirTransport {
    @Override
    public void drivingMethod(String ownership, String GPSPosition, String price, String id, String type) {
        type = "AIR_Airship";
        super.drivingMethod(ownership, GPSPosition, price, id, type);
        System.out.println("It's good to fly in the sky.");
        System.out.println("**************************");
    }
}
