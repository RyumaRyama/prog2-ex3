package jp.ac.uryukyu.ie.e1657_30_58;

import java.io.File; // ファイルやディレクトリの抽象表現
import java.io.FileNotFoundException; // 例外
import java.util.ArrayList; // Listの実装
import java.util.List; // 実装なしクラス
import java.util.Scanner; // 標準入力読み込み

public class Maze {
    private int player[] = new int[2];
    private int mapSize[] = new int[2];
    List<String> listInformation = new ArrayList<>();

    //コンストラクタ
    public Maze(String filename){
        String temp, point[];

        //map.txtからデータ読み込み
        Scanner scanner;
        try{
            scanner = new Scanner(new File(filename));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                listInformation.add(line);
            }
            scanner.close();
        }
        catch(FileNotFoundException e){
            System.err.println(e.getMessage());
            System.exit(1);
        }

        int i;
        //プレイヤー位置取得
        temp = listInformation.get(0);
        point = temp.split("[\\s]+");
        for(i=0; i<2; i++){
            player[i] = (int)point[i].charAt(0);
        }
        //迷路サイズ取得
        temp = listInformation.get(1);
        point = temp.split("[\\s]+");
        for(i=0; i<2; i++){
            mapSize[i] = (int)point[i].charAt(0);
        }

        //Map.txtの1, 2行目を削除
        listInformation.remove(0);
        listInformation.remove(0);

        //Listを配列に変換
        String information[] = listInformation.toArray(new String [listInformation.size()]);
        
    }
}