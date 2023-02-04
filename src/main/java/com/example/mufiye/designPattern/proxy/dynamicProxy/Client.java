package com.example.mufiye.designPattern.proxy.dynamicProxy;

import java.lang.annotation.Target;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        ITeacherDao target = new TeacherDao();

        // 给目标对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

        System.out.println("proxyInstance=" + proxyInstance);
        System.out.println("proxyInstance=" + proxyInstance.getClass()); // 内存中动态生成了代理对象

        proxyInstance.teach();
    }
}
