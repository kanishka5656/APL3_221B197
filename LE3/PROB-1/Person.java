// Abstract class for person with common features like obedience, kindness, and fighting
abstract class Person extends Bharatvanshi {
    // Abstract method for obedience behavior (implemented by each subclass)
    abstract void obey();

    // Abstract method for kindness behavior (implemented by each subclass)
    abstract void showKindness();

    // Concrete method common to all Bharatvanshis: fighting
    @Override
    void fight() {
        System.out.println("This Bharatvanshi is a fighter.");
    }
}
