package character;

public class Goblin extends WalkingMonster{

    @Override
    public void attack() {
        System.out.println("ナイフで切りつける");
    }

    @Override
    public void run() {
        super.run();
    }
}
