package com.example.mufiye.designPattern.singleton;

public class Singleton01 {  // 饿汉式
    // 1. 构造器私有化
    private Singleton01() {

    }

    // 2. 类内部创建一个对象实例
    private static final Singleton01 instance = new Singleton01();

    // 3. 提供一个公有的静态方法返回实例对象
    public static Singleton01 getInstance() {
        return instance;
    }
}
