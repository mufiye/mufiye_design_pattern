package com.example.mufiye.designPattern.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        System.out.println("sheep =" + sheep);
        System.out.println("sheep2 =" + sheep2);
        System.out.println("sheep3 =" + sheep3);
    }
}
