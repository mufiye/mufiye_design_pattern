package com.example.mufiye.designPattern.adapter.atguigu.classAdapter;

public class Phone {
    public void charge(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5){
            System.out.println("start charge");
        }
    }
}
