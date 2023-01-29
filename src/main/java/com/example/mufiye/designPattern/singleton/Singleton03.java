package com.example.mufiye.designPattern.singleton;

public class Singleton03 {  // 懒汉式，线程不安全，不建议使用
    private static Singleton03 instance;

    private Singleton03() {}

    public static Singleton03 getInstance() {
        if(instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}
