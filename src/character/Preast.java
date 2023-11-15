package character;

public class Preast extends Cleric{
    public void selfAid() {
        System.out.println(this.name+"はセルフエイドを唱えた！");
        this.mp = this.mp-3;
        this.hp = this.maxhp;
        System.out.println("HPが最大まで回復した");
        System.out.println("現在MP"+this.mp+"\n");
    }
}
