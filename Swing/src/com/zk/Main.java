package com.zk;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            AlgoFrame frame = new AlgoFrame("Welcome", 500, 500);
        });

//        new MyFrame().setVisible(true);
    }
}
