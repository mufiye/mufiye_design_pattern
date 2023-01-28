package com.example.mufiye.designPattern.adapter.atguigu.classAdapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
    }
}
