package character;

public class Werewolf extends WalkingMonster {

    @Override
    public void attack() {
        System.out.println("かみつく");
    }

    @Override
    public void run() {
        super.run();
    }
}
