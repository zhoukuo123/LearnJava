package com.zk.util;

public class Times {
    public interface Block {
        void execute();
    }

    public static void test(Block block) {
        long begin = System.currentTimeMillis();
        block.execute();
        long end = System.currentTimeMillis();
        double duration = (end - begin) / 1000.0;
        System.out.println("Time consuming: " + duration + "s");
//        // fori
//        for (int i = 0; i <; i++) {
//
//        }
//        // itar
//        for (int i = 0; i < array.length; i++) {
//             = array[i];
//
//        }
//
//        // iter
//        for (Object o : String) {
//
//        }


    }
}
