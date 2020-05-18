package com.wmy.Transportation;

public class MaritimeMeansOfTransport extends Transport {

    public void drivingMethod(String ownership, String GPSPosition, String price,String dateOfPurchase, String id){

        System.out.println("驾驶员："+ownership);
        System.out.println("地理位置："+GPSPosition);
        System.out.println("票价："+price);
        System.out.println("交易日期："+dateOfPurchase);
        System.out.println("该车编号："+id);

    }
}
