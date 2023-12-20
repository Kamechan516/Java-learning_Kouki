package Main;

import character.Hero;

public class ArrayExption {
    public static void main(String[] args) {
        int [] array = new int[5];

        Hero h = null;

        try {
            //array[10] = 20;
            h.run();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外のエラーが発生しました");
        } catch (NullPointerException e) {
            System.out.println("例外:ぬるぽが発生しました！！");
        }
    }
}
