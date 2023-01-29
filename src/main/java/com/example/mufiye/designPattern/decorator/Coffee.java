package com.example.mufiye.designPattern.decorator;

public class Coffee extends Drink{
    public float cost() {
        return super.getPrice();
    }
}
