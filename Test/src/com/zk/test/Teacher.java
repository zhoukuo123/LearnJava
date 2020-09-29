package com.zk.test;

public class Teacher implements Tutorable {
    @Override
    public void teachFootball() {

    }

    @Override
    public void teachBasketball() {
        Tutorable.super.teachBasketball();
        System.out.println("Teacher - teachBasketball");
    }
}
