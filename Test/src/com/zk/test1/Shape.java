package com.zk.test1;

public abstract class Shape {
    protected double area;
    protected double girth;

    public double getArea() {
        return area;
    }

    public double getGirth() {
        return girth;
    }

    protected abstract void calculate();

    public void show() {
        calculate();
        System.out.println(area + "_" + girth);
    }
}
