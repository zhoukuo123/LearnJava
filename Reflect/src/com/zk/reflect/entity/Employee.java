package com.zk.reflect.entity;

public class Employee {
    private Integer eno;
    private String ename;
    private Float salary;
    private String dname;

    static {
        System.out.println("Employee类已被加载到jvm, 并已初始化");
    }

    public Employee() {
        System.out.println("Employee默认构造方法已被执行");
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
