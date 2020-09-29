package com.zk;

import com.zk.util.Times;

public class Main {
    public static void main(String[] args) {
        System.out.println(1);
        for (int i = 0; i < 200; i++) {
            long[] a = new long[10_0000_0000];
        }
        System.out.println(2);

        String s1 = "zk";
        String s2 = new String("zk");
        String s3 = new String(s1);
        String s4 = new String(s2);
        char[] cs = {'z', 'k'};
        String s5 = new String(cs);
        String s6 = new String(s5);




    }

    static void anonymousClass() {
        Runnable person = new Runnable() {
            @Override
            public void run() {
                System.out.println("Person - run");
            }
        };
        person.run();



        new Runnable() {
            @Override
            public void run() {
                System.out.println("Person - run");
            }

            public void eat() {
                System.out.println("Person - eat");
            }
        }.run();






//        Person person = new Person();
//        person.run();
    }

    static void times() {
        Times.test(new Times.Block() {
            @Override
            public void execute() {
                int age = 100000;
                String string = "";
                for (int i = 0; i < age; i++) {
                    string += i;
                }
            }
        });
    }
}
