package com.zk.test1;

public class Child {
    private String name;
    private Tutorable tutor;

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTutor(Tutorable tutor) {
        this.tutor = tutor;
    }

    public void study() {
        tutor.teachProgramming(this);
        tutor.teachFootball(this);
    }
}
