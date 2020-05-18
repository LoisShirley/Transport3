package com.wmy.Transportation;

public class Submarine extends MaritimeMeansOfTransport {
    @Override
    public void drivingMethod(String ownership, String GPSPosition, String price, String id, String type) {
        type = "SEA_Submarine";
        super.drivingMethod(ownership, GPSPosition, price, id, type);
        System.out.println("There are diverse kinds of fish in the ocean.");
        System.out.println("**************************");
    }
}
