package com.example.mufiye.designPattern.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("Mufiye"));

        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("Mike"));

        WebSite webSite3 = factory.getWebSiteCategory("新闻");
        webSite3.use(new User("Tom"));

        System.out.println("数量：" + factory.getWebSiteCount());
    }
}
