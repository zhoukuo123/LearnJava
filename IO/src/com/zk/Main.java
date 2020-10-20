package com.zk;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/linux/1.txt");
        System.out.println(file.setReadOnly());
        File file2 = new File("/home/linux");
        file2.delete();


    }

    public static void test() {
        File file1 = new File("/home/linux");
        String[] files = file1.list();
        System.out.println(Arrays.toString(files));
        String[] files2 = file1.list((dir, name) -> {
            return name.startsWith(".");
        });
        System.out.println(Arrays.toString(files2));


//        System.out.println(file1.getName());
//        System.out.println(file1.getParent());
//        System.out.println(file1.getParentFile());
//        System.out.println(file1.getPath());
//        System.out.println(file1.getAbsolutePath());
//        System.out.println(file1.getAbsoluteFile());
//        System.out.println(file1.length());
//        System.out.println(file1.isFile());
//        System.out.println(file1.isDirectory());
//        System.out.println(file1.canRead());
//        System.out.println(file1.exists());
//        System.out.println(file1.isAbsolute());
//        System.out.println(file1.isHidden());
//        System.out.println(file1.canWrite());


//        System.out.println(File.separator);
//        System.out.println(File.pathSeparator);
//        System.out.println(file.createNewFile());
//        System.out.println(file.delete()); // 删除文件或空目录(不经过回收站)
//        System.out.println(file.mkdir());
//        System.out.println(file.mkdirs()); // 创建当前目录(包括不存在的父目录)
//        System.out.println(file.renameTo(new File("/home/linux/src/2.txt")));

    }
}
