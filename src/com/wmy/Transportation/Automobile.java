package com.wmy.Transportation;

public class Automobile extends LandTransport {
    @Override
    public void drivingMethod(String ownership, String GPSPosition, String price, String id, String type) {
        type = "LAND_Automobile";
        super.drivingMethod(ownership, GPSPosition, price, id, type);
        System.out.println("How fast the Automobile runs!");
        System.out.println("**************************");
    }
}
