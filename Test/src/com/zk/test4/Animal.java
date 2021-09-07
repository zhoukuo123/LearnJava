package com.zk.test4;

/**
 * @author CoderZk
 */
public class Animal<T extends Integer & CharSequence> {
    T a;

    public Animal(T a) {
        this.a = a;
    }
}
