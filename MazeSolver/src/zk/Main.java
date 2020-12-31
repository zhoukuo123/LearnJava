package zk;

public class Main {
    public static void main(String[] args) {
        String mazeFile = "/home/linux/IdeaProjects/LearnJava/MazeSolver/src/com/zk/maze_101_101.txt";
        MazeData data = new MazeData(mazeFile);
        data.print();
    }
}
