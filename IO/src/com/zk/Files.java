package com.zk;

import java.io.File;
import java.util.function.Consumer;

public class Files {
    /**
     * 删除文件或文件夹
     *
     * @param file 文件或目录
     */
    public static void delete(File file) {
        if (file == null || !file.exists()) return;
        if (file.isFile()) {
            file.delete();
            return;
        }

        clean(file);
        file.delete();
    }

    /**
     * 把目录里面的所有东西删掉, 清空目录
     *
     * @param dir 目录
     */
    public static void clean(File dir) {
        if (dir == null || !dir.exists()) return;
        if (dir.isFile()) return;

        File[] subfiles = dir.listFiles();
        for (File file : subfiles) {
            delete(file);
        }
    }

    public static void move(File src, File dest) {
        if (src == null || dest == null) return;
        if (!src.exists() || dest.exists()) return;

        mkparents(dest);
        src.renameTo(dest);
    }

    private static void mkparents(File dest) {
        File parent = dest.getParentFile();
        if (parent.exists()) return;
        parent.mkdirs();
    }

    public static void search(File dir, Consumer<File> operation) {
        if (dir == null || operation == null) return;
        if (!dir.exists() || dir.isFile()) return;

        File[] subfiles = dir.listFiles();
        for (File file : subfiles) {
            operation.accept(file);
            if (file.isFile()) continue;

            search(file, operation);
        }
    }

}
