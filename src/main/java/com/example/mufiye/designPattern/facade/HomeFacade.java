package com.example.mufiye.designPattern.facade;

// 外观类
public class HomeFacade {
    private TheaterLight theaterLight;

    private PopCorn popCorn;

    private Projector projector;

    private DVDPlayer dvdPlayer;

    private Screen screen;

    private Stereo stereo;

    public HomeFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.projector = Projector.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    public void ready() {
        popCorn.on();
        popCorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.on();
    }

    public void play() {
        dvdPlayer.pause();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popCorn.off();
        stereo.off();
        screen.up();
        theaterLight.off();
        dvdPlayer.off();
        projector.off();
    }

    public static void main(String[] args) {

    }
}
