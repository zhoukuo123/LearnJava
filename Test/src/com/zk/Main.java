package com.zk;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setId(1);
        stu1.setSex('男');
        stu1.setAge(18);
        stu1.setProfessionName("计算机");
        stu1.setLengthOfSchooling(4);
        System.out.println(stu1.getAge());

    }
}
