package com.example.mufiye.designPattern.proxy.dynamicProxy;

public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("老师正在授课中");
    }
}
