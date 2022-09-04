package com.example.mufiye.designPattern.dynamicProxy;

import org.junit.Test;

public class dynamicProxyTest {
    @Test
    public void testAll(){
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send(" hello, mufiye");
    }
}
