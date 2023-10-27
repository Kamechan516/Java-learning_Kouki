package Main;

import character.Cleric;

public class Rensyu8_1 {
    public static void main(String[] args) {
        Cleric blue = new Cleric();
        blue.name = "中島先生";
        System.out.println("クレリックの" + blue.name + "を生み出した!");

        blue.selfAid();

        int sec = 5;
        System.out.println("MPが" + blue.pray(sec) + "回復した");
    }
}
