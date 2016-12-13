package jp.ac.uryukyu.ie.e1657_30_58;

import java.util.Scanner;

public class ExMain {
    public void main (String args[]) {
        System.out.println("ファイル名を入力してください。");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        Maze maze = new Maze(filename);
        Player player = new Player(maze.getPlayer);

        player.leftMove();//壁の確認もする, 移動後はマップの"P"を書き換える。
        maze.printMaze(); //表示される"P"はプレイヤー

        player.underMove();
        maze.printMaze();

        player.rightMove();//テストマップでは、壁にぶつかる予定。
        maze.printMaze(); //表示される"P"はプレイヤー
    }
}