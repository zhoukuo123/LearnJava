package com.zk;

public class Dog {
    // 成员变量
    public int age;
    public double weight;

    public Dog() {

    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    // 方法
    public void run() {
        System.out.println(age + "_" + weight + "_walk");
    }
    public void eat(String food) {
        System.out.println(age + "_" + weight + "_eat_" + food);
    }
}
