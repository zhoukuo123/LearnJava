package com.zk.test1;

public class Circle extends Shape {
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    protected void calculate() {
        double half = Math.PI * radius;
        area = half * radius;
        girth = 2 * half;
    }
}
