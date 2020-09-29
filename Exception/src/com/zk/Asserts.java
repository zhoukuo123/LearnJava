package com.zk;

public class Asserts {
    public static void test(boolean v) {
        if (v) return;

        throw new IllegalArgumentException("条件不成立");
    }
}
