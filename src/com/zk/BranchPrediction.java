package com.zk;

/**
 * @author CoderZk
 * <p>
 * 流水线指令的CPU为了解决控制冒险的分支预测方式导致的性能差异, 前面的for循环的分支预测错误情况会少
 */
public class BranchPrediction {
    public static void main(String args[]) {
        int a = 1;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 10000; k++) {
                    a = 100 * 123324;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Time spent is " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 100; k++) {
                    a = 100 * 123324;
                }
            }
        }
        end = System.currentTimeMillis();
        System.out.println("Time spent is " + (end - start) + "ms");
    }
}