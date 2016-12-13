package jp.ac.uryukyu.ie.e1657_30_58;

/**
 * Created by e165758 on 2016/12/13.
 */
class TestMain {
    public static void main(String[] args){
        String fn = "./src/main/jp/ac/uryukyu/ie/e1657_30_58/map.txt";
        Maze maze = new Maze(fn);
        System.out.println(maze.board);
    }
}