package com.example.mufiye.designPattern.builder;

public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBase() {
        System.out.println("普通房子打地基");
        house.setBase("common base");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙10cm");
        house.setWall("common wall");
    }

    @Override
    public void buildProof() {
        System.out.println("普通房子屋顶");
        house.setProof("common proof");
    }
}
