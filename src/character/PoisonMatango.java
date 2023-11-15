package character;

public class PoisonMatango extends Matango{
    //攻撃可能回数の初期値を設定
    int Attack_cnt = 5;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);

        if(this.Attack_cnt > 0) {
            System.out.println("さらに毒の胞子をばら撒いた");
            int dmg = h.hp / 5;
            h.hp = h.hp - dmg;
            System.out.println(dmg + "のダメージを受けた");
            this.Attack_cnt--;
        }
    }


}
