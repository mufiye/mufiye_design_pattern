package com.example.mufiye.designPattern.composite;

public class Department extends OrganizationComponent{

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    // add和remove方法就不用写了，因为这是叶子节点
    @Override
    protected void printInfo() {
        System.out.println(getName() + "  " + getDes());
    }
}
