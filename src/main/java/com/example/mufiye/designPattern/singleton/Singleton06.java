package com.example.mufiye.designPattern.singleton;

public class Singleton06 {  // 静态内部类方法。当调用getInstance方法时会进行内部类初始化以及实例装载，同时装载时线程安全。
    private Singleton06() {}

    private static class SingletonInstance {
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    private static Singleton06 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
