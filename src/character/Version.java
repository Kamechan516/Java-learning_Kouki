package character;

public interface Version {

    final double ver = 1.0;
    //void printVersion();

    default void printVersion() {
        System.out.println("このクラスのバージョンは" + ver + "です");
    }
}
