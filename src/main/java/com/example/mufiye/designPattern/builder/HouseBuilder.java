package com.example.mufiye.designPattern.builder;

public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBase();

    public abstract void buildWall();

    public abstract void buildProof();

    public House buildHouse(){
        return house;
    }
}
