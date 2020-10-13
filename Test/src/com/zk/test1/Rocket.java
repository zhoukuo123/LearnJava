package com.zk.test1;

// 饿汉式单例模式
//public class Rocket {
//    private static Rocket instance = new Rocket();
//    private Rocket() {}
//    public static Rocket getInstance() {
//        return instance;
//    }
//}

// 懒汉式单例模式(有线程安全问题)
public class Rocket {
    private static Rocket instance = null;
    private Rocket() {}
    public static Rocket getInstance() {
        // 这个方法并非线程安全
        if (instance == null) {
            instance = new Rocket();
        }
        return instance;
    }
}