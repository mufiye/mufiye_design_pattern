package com.example.mufiye.designPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    // 维护一个目标对象
    private Object target;

    public ProxyFactory(Object object) {
        target = object;
    }

    // 给目标对象生成一个代理对象
    public Object getProxyInstance() {
        /*
            ClassLoader loader: 指定当前目标对象使用的类加载器，获取加载器的方法固定
            Class<?>[] interfaces: 目标对象实现的接口类型，使用范型方法确认类型
            InvocationHandler invocationHandler: 事件处理，执行目标对象的方法时，会触发事件处理器方法，会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk代理开始");
                        // 通过反射机制调用目标对象的方法
                        Object ret = method.invoke(target, args);
                        System.out.println("jdk代理提交");
                        return ret;
                    }
                });
    }
}
