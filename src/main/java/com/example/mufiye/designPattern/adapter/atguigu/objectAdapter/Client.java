package com.example.mufiye.designPattern.adapter.atguigu.objectAdapter;

// 使用组合代替继承
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter(new Voltage220V()));
    }
}
