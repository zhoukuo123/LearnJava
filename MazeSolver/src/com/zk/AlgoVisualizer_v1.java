package com.zk;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS
 */
public class AlgoVisualizer_v1 {
    private static int DELAY = 20;
    private static int blockSide = 8; // 每一个小格子8像素

    private MazeData data;        // 数据
    private AlgoFrame frame;      // 视图

    public static final int d[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public AlgoVisualizer_v1(String mazeFile) {

        // 初始化数据
        data = new MazeData(mazeFile);

        int sceneHeight = data.N() * blockSide;
        int sceneWidth = data.M() * blockSide;

        // 初始化视图
        EventQueue.invokeLater(() -> {
            frame = new AlgoFrame("Maze Solver Visualization", sceneWidth, sceneHeight);

            new Thread(() -> {
                run();
            }).start();
        });
    }

    // 动画逻辑
    private void run() {
        setData(-1, -1, false);

        Queue<Position> queue = new LinkedList<>();
        Position entrance = new Position(data.getEntranceX(), data.getEntranceY());
        queue.offer(entrance);
        data.visited[entrance.getX()][entrance.getY()] = true;

        boolean isSolved = false;
        while (!queue.isEmpty()) {
            Position curPos = queue.poll();
            setData(curPos.getX(), curPos.getY(), true);

            if (curPos.getX() == data.getExitX() && curPos.getY() == data.getExitY()) {
                isSolved = true;
                findPath(curPos);
                break;
            }

            for (int i = 0; i < 4; i++) {
                int newX = curPos.getX() + d[i][0];
                int newY = curPos.getY() + d[i][1];

                if (data.inArea(newX, newY)
                        && !data.visited[newX][newY]
                        && data.getMaze(newX, newY) == MazeData.ROAD) {
                    queue.offer(new Position(newX, newY, curPos));
                    data.visited[newX][newY] = true;
                }
            }
        }

        if (!isSolved) {
            System.out.println("The maze has no Solution!");
        }

        setData(-1, -1, false);
    }

    private void findPath(Position des) {
        Position cur = des;
        while (cur != null) {
            data.result[cur.getX()][cur.getY()] = true;
            cur = cur.getPrev();
        }
    }

    private void setData(int x, int y, boolean isPath) {
        if (data.inArea(x, y)) {
            data.path[x][y] = isPath;
        }

        frame.render(data);
        AlgoVisHelper.pause(DELAY);
    }

    public static void main(String[] args) {
        String mazeFile = "/home/linux/IdeaProjects/LearnJava/MazeSolver/src/com/zk/maze_101_101.txt";

        AlgoVisualizer_v1 vis = new AlgoVisualizer_v1(mazeFile);
    }
}
