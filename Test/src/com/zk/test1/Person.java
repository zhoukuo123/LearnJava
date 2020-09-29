package com.zk.test1;

public class Person {
    // final修饰成员变量时要求对象一旦被创建完final修饰的成员变量就要有值
    private final int age = 9;
    private static final int height = 10;
    public void speak() {
        System.out.println("Person - speak");
    }

    public void run() {
        System.out.println("Person - run");
    }

    public Object test() {
        return 10;
    }

    public final void test2() {
        System.out.println("helloWorld");
    }

    public class Hand {

    }

    public static class Car {

    }

}
