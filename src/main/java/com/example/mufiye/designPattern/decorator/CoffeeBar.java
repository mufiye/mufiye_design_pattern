package com.example.mufiye.designPattern.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink orderDrink = new LongBlack();
        System.out.println(orderDrink.getDes());
        System.out.println(orderDrink.cost());

        orderDrink = new Milk(orderDrink); // 加入一份牛奶
        System.out.println(orderDrink.getDes());
        System.out.println(orderDrink.cost());

        orderDrink = new Chocolate(orderDrink); // 加入一份巧克力
        System.out.println(orderDrink.getDes());
        System.out.println(orderDrink.cost());

        orderDrink = new Chocolate(orderDrink); // 再加入一份巧克力
        System.out.println(orderDrink.getDes());
        System.out.println(orderDrink.cost());
    }
}
