package com.example.mufiye.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

// university就相当于树形结构中的非叶子节点, 可以管理college
public class University extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void printInfo() {
        System.out.println("--------------" + getName() + "-----------------");
        for(OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.printInfo();
        }
    }
}
