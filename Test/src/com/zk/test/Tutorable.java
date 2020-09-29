package com.zk.test;

public interface Tutorable {
    void teachFootball();
    default void teachBasketball() {
        System.out.println("Tutorable - teachBasketball");
    }
}
