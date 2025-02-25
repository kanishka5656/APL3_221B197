
public class LazySingleton {
    private static volatile LazySingleton instance;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy Singleton: Hello!");
    }

    public static void main(String[] args) {
        LazySingleton.getInstance().showMessage();
    }
}
