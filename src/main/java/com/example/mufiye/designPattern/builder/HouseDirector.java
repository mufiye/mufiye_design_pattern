package com.example.mufiye.designPattern.builder;

public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(){

    }

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House constrcutHouse(){
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.buildProof();
        return houseBuilder.buildHouse();
    }
}
