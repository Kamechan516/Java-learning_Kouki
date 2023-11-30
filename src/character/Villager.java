package character;

public class Villager implements Creature{
    @Override
    public void run() {
        String name = "サイムン";
        System.out.println("村人" + name + "は夜逃げした！");
    }
}
