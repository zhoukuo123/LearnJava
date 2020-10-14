package com.zk;

public class Person {
    public void eat(Eatable e) {
        System.out.println("eat - " + e.getName()
                + " - " + e.getEnergy());
    }
}
