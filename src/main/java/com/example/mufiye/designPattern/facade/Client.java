package com.example.mufiye.designPattern.facade;

public class Client {
    public static void main(String[] args) {
        HomeFacade homeFacade = new HomeFacade();
        homeFacade.ready();
        homeFacade.play();
        homeFacade.end();
    }
}
