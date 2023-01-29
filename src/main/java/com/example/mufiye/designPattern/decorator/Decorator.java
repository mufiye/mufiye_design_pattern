package com.example.mufiye.designPattern.decorator;

public class Decorator extends Drink{
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.des + " " + getPrice() + " && " + obj.getDes();
    }
}
