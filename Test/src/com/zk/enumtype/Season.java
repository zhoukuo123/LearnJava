package com.zk.enumtype;

/**
 * @author CoderZk
 * @date 2020/10/29
 */
//public class Season {
//    private Season() {}
//    public static final Season SPRING = new Season();
//    public static final Season SUMMER = new Season();
//    public static final Season FALL = new Season();
//    public static final Season WINTER = new Season();
//}

//public enum Season {
//    SPRING, SUMMER, FALL, WINTER;
//
//    private int age;
//    private String name;
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    Season() {
//
//    }
//}


public enum Season {
    SPRING(5, 15),
    SUMMER(25, 35),
    FALL(15, 25),
    WINTER(-5, 5);

    private int min;
    private int max;

    Season(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}