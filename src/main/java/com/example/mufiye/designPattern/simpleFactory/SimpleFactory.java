package com.example.mufiye.designPattern.simpleFactory;

// 简单工厂类, 常写为静态
public class SimpleFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
