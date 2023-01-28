package com.example.mufiye.designPattern.builder;

public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void buildBase() {
        System.out.println("高楼打地基");
        house.setBase("high base");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙壁");
        house.setWall("high wall");
    }

    @Override
    public void buildProof() {
        System.out.println("高楼造屋顶");
        house.setProof("high proof");
    }
}
