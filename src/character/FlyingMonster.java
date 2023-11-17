package character;

public class FlyingMonster extends Monster {

    @Override
    public void attack() {}

    @Override
    public void run() {
        System.out.println("バサバサ飛んで逃げる");
    }
}
