package character;

public class HyperHero extends SuperHero{
    public void Teleport() {
        System.out.println(this.name + "は瞬間移動した");
    }

    public void flyLandSit(int sec) {
        this.fly();
        this.land();
        this.sit(sec);
    }
}
