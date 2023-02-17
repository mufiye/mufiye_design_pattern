package com.example.mufiye.designPattern.flyweight;

import java.util.HashMap;

// 网站工厂类，根据需求返回一个网站
public class WebSiteFactory {
    // 集合，充当池的作用
    private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type) {
        if(!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }

        return (WebSite) pool.get(type);
    }

    // 获取网站分类的总数(池中有多少个网站类型)
    public int getWebSiteCount() {
        return pool.size();
    }
}

