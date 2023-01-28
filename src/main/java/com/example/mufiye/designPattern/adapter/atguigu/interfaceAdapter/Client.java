package com.example.mufiye.designPattern.adapter.atguigu.interfaceAdapter;

public class Client {
    public static void main(String[] args) {
        Interface1 adapter = new InterAdapter() {
            @Override
            public void before() {
                System.out.println("hello, before");
            }
        };
        adapter.before();
    }
}
