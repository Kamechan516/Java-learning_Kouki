package character;
import java.math.*;
import java.util.Random;

public class Cleric {

    public String name;
    public int hp = 50;
    public final int hp_max = 50;

    public int mp = 1;

    public int heel;

    public int heel_mp;

    public final int mp_max = 10;

    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた");

        hp = hp + hp_max;
        System.out.println("体力が満タンまで回復した");

        /*if(this.hp < this.hp_max) {
            System.out.println("体力が満タンまで回復した");
            this.hp = this.hp_max;
        } else {
            System.out.println("しかし体力が満タンなので魔法が発動しなかった！！");
        }*/
    }

    public int pray(int sec) {
        System.out.println(this.name + "は"+ sec + "秒間お祈りした");
        Random rnd = new Random();
        heel = rnd.nextInt(3) + sec;

        heel_mp = Math.min(this.mp_max - this.mp, heel);
        this.mp = heel_mp;

        return heel_mp;
    }

}
