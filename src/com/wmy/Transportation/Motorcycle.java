package com.wmy.Transportation;

public class Motorcycle extends LandTransport {
    @Override
    public void drivingMethod(String ownership, String GPSPosition, String price, String id, String type) {
        type = "LAND_Motorcycle";
        super.drivingMethod(ownership, GPSPosition, price, id, type);
        System.out.println("How fast the motorcycle runs!");
        System.out.println("**************************");
    }
}
