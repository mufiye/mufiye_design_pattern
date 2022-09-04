package com.example.mufiye.designPattern.cglibProxy;

public class SmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
