package com.example.mufiye.designPattern.adapter.atguigu.objectAdapter;

public class Phone {
    public void charge(Voltage5V voltage5V) {
        if(voltage5V.output5V() == 5){
            System.out.println("start charge");
        }
    }
}
