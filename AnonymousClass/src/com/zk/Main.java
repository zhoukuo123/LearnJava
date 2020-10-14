package com.zk;

import com.zk.util.Files;
import com.zk.util.Times;

public class Main {
    public static void main(String[] args) {
        String s1 = "zk";
        String s2 = new String("zk");
        String s3 = new String(s1);
        String s4 = new String(s2);
        char[] cs = {'z', 'k'};
        String s5 = new String(cs);
        String s6 = new String(s5);
//        Person person = new Person();
//        person.eat(new Eatable() {
//            @Override
//            public String getName() {
//                return "Apple";
//            }
//
//            @Override
//            public int getEnergy() {
//                return 100;
//            }
//        }); // eat - Apple - 100
//        Times.test(new Times.Block() {
//            @Override
//            public void execute() {
//                int age = 100000;
//                String string = "";
//                for (int i = 0; i < age; i++) {
//                    string += i;
//                }
//            }
//        });
//        Networks.get("https://xxx.com?name=xx&age = 18", new Networks.Block() {
//            @Override
//            public void success(Object response) {
//                System.out.println("请求成功");
//            }
//
//            @Override
//            public void failure() {
//                System.out.println("请求失败");
//            }
//        });
        Files.getAllFilenames("/home/linux", new String[]{"txt", "pptx"});

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
