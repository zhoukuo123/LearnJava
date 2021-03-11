package com.zk.reflect.sample;

public class Addition implements MathOperation {
    @Override
    public float operate(int a, int b) {
        System.out.println("执行加法运算");
        return a + b;
    }
}
