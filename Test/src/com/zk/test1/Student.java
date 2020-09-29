package com.zk.test1;

public class Student implements Tutorable, Babysitterable {
    @Override
    public void teachProgramming(Child child) {
        System.out.println("com.zk.Student teaches " + child.getName() + " programming");
    }

    @Override
    public void teachFootball(Child child) {
        System.out.println("com.zk.Student teaches " + child.getName() + " football");
    }

    @Override
    public void cook(Child child) {

    }


//    private static int no;
//    private static int age = 10;
//    private int height = 100;
//
//
//    public com.zk.Student() {
//        no = 10;
//        age = 20;
//        height = 30;
//    }
//
//    // 初始化块
//    {
//        height = 10;
//    }
//
//    // 静态初始化块
//    static {
//        age = 20;
//    }
//
//    @Override
//    public void speak() {
//        super.speak();
//        run();
//        this.run();
//        super.run();
//    }
//
//    // 内部不可以使用this
//    public static void test1() {
//        com.zk.Student.no = 1;
//        System.out.println(com.zk.Student.age);
//    }
//
//    @Override
//    public void run() {
//        System.out.println("com.zk.Student - run");
//    }
//
//    @Override
//    public String test() {
//        return "test";
//    }


}
