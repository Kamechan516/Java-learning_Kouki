package character;

import java.util.Random;
import java.util.jar.Manifest;

public class Cleric {

    public String name;//名前を管理変数
    int hp = 50;//HPを管理する変数
    final int maxhp = 50;//最大HP（固定）定数フィールド
    int mp = 10;//MP
    final int maxmp = 10;//最大MP（固定）定数フィールド
    int pc = 0;
    int[] pd=new int[255];

    //メソッド名：selfAid()
    //引数：なし
    //戻り値：なし
    //処理：HPの回復
    public void selfAid() {
        System.out.println(this.name+"はセルフエイドを唱えた！");
        this.mp = this.mp-5;
        this.hp = this.maxhp;
        System.out.println("HPが最大まで回復した");
        System.out.println("現在MP"+this.mp+"\n");
    }



    //メソッド名：pray()
    //引数：なし
    //戻り値：なし
    //処理：乱数を生成してMPの回復
    public void pray(int sec) {
        Random rnd = new Random();
        int r = rnd.nextInt(3);
        int recovery = sec + r;//回復した分の計算
        this.mp = mp + recovery;
        //あふれた分の削除
        if(this.mp>= this.maxmp) {
            this.mp=this.mp-this.maxmp;
        }


        System.out.println(this.name+"は"+sec+"秒メッカにお祈りした!\n"+"MPが"+recovery+"回復");
        System.out.println("現在MP"+this.mp+"\n");
        this.pc++;
        pd[pc]+=recovery;
    }

    public void pray(int sec, Matango mt) {
        Random rnd1 = new Random();
        int r1 = rnd1.nextInt(3);
        //回復分の計算
        int recovery = sec + r1;

        this.mp = mp + sec;
        if(this.mp >= this.maxmp) {
            this.mp=this.mp-this.maxmp;
        }

        System.out.println(this.name+"は"+sec+"秒メッカにお祈りした!\n"+"MPが"+recovery+"回復");
        System.out.println("現在MP"+this.mp+"\n");
        this.pc++;
        pd[pc]+=recovery;

        //攻撃
        System.out.println(this.name + "は、お化けきのこに攻撃した");
        mt.hp = mt.hp - recovery;
        System.out.println("お化けきのこは" + recovery + "のダメージを受けた");
    }


    public void printMp() {

        System.out.println("【ゲームログ】");
        System.out.println(this.name+"の「お祈り」によって回復したMP");
        for(int i= 0; i<this.pc;i++) {

            System.out.println(i+1+"回目・・・"+this.pd[i+1]);
        }
    }


}

