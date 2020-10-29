package com.zk.enumtype;

/**
 * @author CoderZk
 * @date 2020/10/29
 */
public class Main {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        test(s);
    }

    public static void test(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case FULL:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }


        if (season == Season.SPRING) {
            System.out.println("春天");
        } else if (season == Season.SUMMER) {
            System.out.println("夏天");
        } else if (season == Season.FULL) {
            System.out.println("秋天");
        } else if (season == Season.WINTER) {
            System.out.println("冬天");
        }
    }
}
