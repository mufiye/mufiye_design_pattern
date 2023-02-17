package com.example.mufiye.designPattern.flyweight;

public class ConcreteWebsite extends WebSite{
    private String type = "";  // 网站发布的形式, 享元模式中的内部状态

    // private User user;  // 网站的使用者，享元模式中的外部状态

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) { // user，网站的使用者，享元模式中的外部状态
        System.out.println("网站的发布形式为：" + type + " 使用者为：" + user.getName());
    }
}
