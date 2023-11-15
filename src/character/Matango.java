package character;

public class Matango {
    public int hp;

    final int LEVEL = 10;

    public char suffix;

    public Matango(char suffix) {
    }

    public void run() {
        System.out.println("お化けきのこ" + this.suffix + "は逃げ出した");
    }
    
    public void attack(Hero h) {
        
    }
}
