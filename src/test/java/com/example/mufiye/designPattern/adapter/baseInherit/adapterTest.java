package com.example.mufiye.designPattern.adapter.baseInherit;

import org.junit.Test;

public class adapterTest {
    @Test
    public void baseInheritTest(){
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
