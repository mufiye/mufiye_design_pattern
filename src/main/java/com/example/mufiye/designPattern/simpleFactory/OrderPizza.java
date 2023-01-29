package com.example.mufiye.designPattern.simpleFactory;

public class OrderPizza {
    SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
    }

    public Pizza doOrder(String orderType) {
        return simpleFactory.createPizza(orderType);
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        OrderPizza orderPizza = new OrderPizza(simpleFactory);
        Pizza pizza = orderPizza.doOrder("greek");
    }
}
