package character;
public class Hero implements Version {
    public String name;//名前を管理変数
    public int hp;//HPを管理する変数
    int level = 10;//レベル（固定）

    //コンストラクタ（引数：name,hp）
    public Hero(int hp,String name ) {
        this.hp = hp;//可変
        this.name = name;//可変
    }

    //コンストラクタ（引数：name）
    public Hero(String name) {
        this.hp = 100;//固定
        this.name = name;//可変
    }

    //コンストラクタ（引数：なし）
    public Hero() {
        //this.hp = 100;//固定
        //this.name = "ダミー";//固定
        //Stringを引数に持つコンストラクタを実行
        this("マダガスカル");
    }

    //メソッド名：sleep()
    //引数：なし
    //戻り値：なし
    //処理：
    public void sleep() {
        System.out.println(this.name + "は、眠って回復した！\n");
    }

    //メソッド名：sit()
    //引数：int型sec(秒数)
    //戻り値：なし
    //処理：クラス変数hpに対してsec秒分だけHPを回復
    public void sit(int sec) {
        this.hp +=sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが"+ sec + "ポイント回復した\n");
    }

    //メソッド名：slip()
    //引数：なし
    //戻り値：なし
    //処理：HPを-5(固定)する
    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！\n");
    }

    //メソッド名：run()
    //引数：なし
    //戻り値：なし
    //処理：GAMEOVERで最終結果を表示する
    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした\n");
    }

    //@Override
    /*public void printVersion() {
        System.out.println("Heroクラスのバージョンは" + this.ver + "です");
    }*/
}