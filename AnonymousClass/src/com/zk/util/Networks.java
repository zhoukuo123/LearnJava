package com.zk.util;

public class Networks {
    public interface Block {
        void success(Object response);
        void failure();
    }
    public static void get(String url, Block callback) {
        // 1.根据url发送一个异步请求(开启一条子线程)

        // 2.请求完毕后
        boolean result = true;
        if (result) {
            Object response = null;
            callback.success(response);
        } else {
            callback.failure();
        }
    }
}
