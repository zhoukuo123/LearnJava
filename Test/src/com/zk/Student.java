package com.zk;

public class Student {
    private String name;
    private int id;
    private char sex;
    private int age;
    private String professionName;
    private int lengthOfSchooling;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setProfessionName(String professionName) {
        this.professionName = name;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setLengthOfSchooling(int lengthOfSchooling) {
        this.lengthOfSchooling = lengthOfSchooling;
    }

    public int getLengthOfSchooling() {
        return lengthOfSchooling;
    }

}
