
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton() {}
    
    public static EagerSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Eager Singleton: Hello!");
    }

    public static void main(String[] args) {
        EagerSingleton.getInstance().showMessage();
    }
}
