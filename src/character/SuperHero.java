package character;

public class SuperHero extends Hero{

    // Heroクラスで定義してあるフィールド・メソッドは全て利用可能
    //SuperHeroクラスだけ飛ぶことができる
    boolean flying;

    public void fly() {
        this.flying = true;

        System.out.println("飛び上がった ！");
    }

    public void land() {
        this.flying = false;
        System.out.println("着地した!");
    }

    public void run() {
        System.out.println(this.name + "は撤退した");
    }

    public void appear() {
        System.out.println(this.name + "は現れた");
    }

    public void hide() {
        System.out.println(this.name + "は隠れた");
    }
}
