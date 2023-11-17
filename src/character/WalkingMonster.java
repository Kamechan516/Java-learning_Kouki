package character;

public class WalkingMonster extends Monster {

    @Override
    public void attack() {}

    @Override
    public void run() {
        System.out.println("とことこ走って逃げる");
    }
}
