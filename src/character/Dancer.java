package character;

public class Dancer extends Character {

    public void dance() {
        System.out.println(this.name + "情熱的に踊った");
    }

    @Override
    public void attack(Matango mt) {
        System.out.println(this.name + "の攻撃");
        System.out.println("敵に3ポイントのダメージ");
    }
}
