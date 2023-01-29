package com.example.mufiye.designPattern.singleton;

public class Singleton02 {  // 饿汉式
    private static Singleton02 instance;

    static { // 在静态代码块中创建单例对象
        instance = new Singleton02();
    }

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        return instance;
    }
}
