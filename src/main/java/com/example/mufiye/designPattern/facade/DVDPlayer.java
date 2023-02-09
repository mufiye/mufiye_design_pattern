package com.example.mufiye.designPattern.facade;

public class DVDPlayer {
    // 使用单例模式
    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {

    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD on");
    }

    public void off() {
        System.out.println("DVD off");
    }

    public void play() {
        System.out.println("DVD play");
    }

    public void pause() {
        System.out.println("DVD pause");
    }
}
