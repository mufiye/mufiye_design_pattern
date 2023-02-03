package com.example.mufiye.designPattern.proxy.staticProxy;

public class TeacherProxy implements ITeacherDao {

    private ITeacherDao targetObject;

    public TeacherProxy(ITeacherDao target) {
        targetObject = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");
        targetObject.teach();
        System.out.println("代理结束");
    }
}
