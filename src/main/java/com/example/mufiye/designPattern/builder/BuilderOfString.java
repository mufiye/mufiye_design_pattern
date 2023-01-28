package com.example.mufiye.designPattern.builder;

import java.io.IOException;

public class BuilderOfString {
    public static void main(String[] args) throws IOException {
        Appendable stringBuilder = new StringBuilder("hello, world");
        stringBuilder.append("m");
        System.out.println(stringBuilder);
    }
}
