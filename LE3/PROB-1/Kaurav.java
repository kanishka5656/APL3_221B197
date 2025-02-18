// Concrete class representing the Kauravs
class Kaurav extends Person {
    // Override the obedience method
    @Override
    void obey() {
        System.out.println("Kaurav disobeys the rules.");
    }

    // Override the kindness method
    @Override
    void showKindness() {
        System.out.println("Kaurav is cruel.");
    }
}
