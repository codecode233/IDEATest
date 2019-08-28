package com.company;

public class Animal implements Talk{
    private String name;
    private int age;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    //构造函数
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println("This is a animal");
    }
}
