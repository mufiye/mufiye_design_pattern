package com.example.mufiye.designPattern.cglibProxy;

import org.junit.Test;

public class cglibProxyTest {
    @Test
    public void testAll(){
        SmsService smsService = (SmsService) CglibProxyFactory.getProxy(SmsService.class);
        smsService.send(" hello, mufiye, this message is for cglib dynamic proxy");
    }
}
