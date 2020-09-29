package com.zk.test1;

public class Robot implements Tutorable {
    @Override
    public void teachProgramming(Child child) {
        System.out.println("Robot teaches " + child.getName() + " programming");
    }

    @Override
    public void teachFootball(Child child) {
        System.out.println("Robot teaches " + child.getName() + " football");
    }
}
