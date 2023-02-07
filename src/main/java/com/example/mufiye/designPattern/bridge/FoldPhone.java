package com.example.mufiye.designPattern.bridge;

public class FoldPhone extends Phone{

    public FoldPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("折叠手机打开");
    }

    public void close() {
        super.close();
        System.out.println("折叠手机关机");
    }

    public void call() {
        super.call();
        System.out.println("折叠手机打电话");
    }
}
