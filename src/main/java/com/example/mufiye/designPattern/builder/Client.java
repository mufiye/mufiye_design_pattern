package com.example.mufiye.designPattern.builder;

public class Client {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new CommonHouseBuilder();
        HouseDirector director = new HouseDirector(houseBuilder);
        House house = director.constrcutHouse();
        System.out.println(house.getBase());
        System.out.println(house.getWall());
        System.out.println(house.getProof());
    }
}
