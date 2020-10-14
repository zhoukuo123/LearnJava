package com.zk;

public class Cat {
    public String name;
    public int age;
    public int price;
    public Cat(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }
    public Cat(String name) {
        this(name, 0, 0);
    }
}
