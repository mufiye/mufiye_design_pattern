package com.example.mufiye.designPattern.singleton;

public class Singleton07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance2 == instance);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.sayOK();
    }
}

enum Singleton {
    INSTANCE;
    public void sayOK() {
        System.out.println("ok~");
    }
}