package com.example.mufiye.designPattern.singleton;

public class Singleton04 {  // 懒汉式，线程安全，但是效率太低，不推荐使用
    private static Singleton04 instance;

    private Singleton04() {}

    public static synchronized Singleton04 getInstance() {
        if(instance == null){
            instance = new Singleton04();
        }
        return instance;
    }
}
