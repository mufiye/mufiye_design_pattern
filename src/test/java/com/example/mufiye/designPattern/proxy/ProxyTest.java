package com.example.mufiye.designPattern.proxy;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void testAll(){
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字:"+p.getPrinterName()+"。");
        p.setPrinterName("Bon");
        System.out.println("现在的名字:"+p.getPrinterName()+"。");
        p.print("Hello,world");
    }
}
