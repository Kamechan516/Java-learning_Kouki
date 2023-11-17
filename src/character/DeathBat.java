package character;

public class DeathBat extends FlyingMonster {

    @Override
    public void attack() {
        System.out.println("突っつく");
    }

    @Override
    public void run() {
        super.run();
    }
}
