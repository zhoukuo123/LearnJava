package com.zk.test1;

public class Teacher implements Tutorable {
    @Override
    public void teachProgramming(Child child) {
        System.out.println("Teacher teaches " + child.getName() + " programming");
    }

    @Override
    public void teachFootball(Child child) {
        System.out.println("Teacher teaches " + child.getName() + " football");
    }
}
