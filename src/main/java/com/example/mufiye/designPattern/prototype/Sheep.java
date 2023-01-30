package com.example.mufiye.designPattern.prototype;

public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color +"]";
    }

    @Override
    protected Object clone() {

        Sheep sheep = null;
        try{
            sheep = (Sheep) super.clone();
        } catch (Exception e){

        }
        return sheep;
    }
}
