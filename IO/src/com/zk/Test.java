package com.zk;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File dir = new File("/home/linux/src");
        Files.search(dir, (file) -> {
            System.out.println(file);
        });

    }
}
