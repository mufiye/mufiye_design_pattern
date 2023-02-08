package com.example.mufiye.designPattern.composite;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "top1");
        OrganizationComponent college1 = new College("计算机学院", "向往的地方");
        OrganizationComponent college2 = new College("信息工程学院", "也不是不行");

        college1.add(new Department("软件工程", "想去"));
        college1.add(new Department("网络工程", "最强网管"));

        college2.add(new Department("自动化", "牛得很"));

        university.add(college1);
        university.add(college2);

        university.printInfo();
    }
}
