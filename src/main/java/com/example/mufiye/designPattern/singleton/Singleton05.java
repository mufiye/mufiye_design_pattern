package com.example.mufiye.designPattern.singleton;

public class Singleton05 {  // 线程安全，效率较高，推荐使用
    private static Singleton05 instance;

    private Singleton05() {}

    public static Singleton05 getInstance() {
        if(instance == null) {
            synchronized (Singleton05.class) {
                if(instance == null) {
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }
}
