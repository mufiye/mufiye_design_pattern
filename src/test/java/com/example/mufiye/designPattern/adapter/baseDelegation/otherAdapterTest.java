package com.example.mufiye.designPattern.adapter.baseDelegation;

import org.junit.Test;

public class otherAdapterTest {
    @Test
    public void baseDelegationTest(){
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
