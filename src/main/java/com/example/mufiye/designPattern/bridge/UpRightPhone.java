package com.example.mufiye.designPattern.bridge;

public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("滑盖手机打开");
    }

    public void close() {
        super.close();
        System.out.println("滑盖手机关机");
    }

    public void call() {
        super.call();
        System.out.println("滑盖手机打电话");
    }
}
