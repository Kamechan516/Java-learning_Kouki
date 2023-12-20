package Main;

import java.io.*;

public class Code17_1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
        } catch (IOException e) {
            System.out.println("エラーが発生しました！");
        }
    }
}
