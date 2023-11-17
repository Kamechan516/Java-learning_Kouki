package character;

//abstract... 抽象的(あいまい)


public abstract class Character {
    String name;
    int hp;

//    public abstract void attack(Matango mt);
//
//    public abstract void run();

    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }

    public abstract void attack(Matango mt);
}


