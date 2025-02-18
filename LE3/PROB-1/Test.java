public class Test {
    public static void main(String[] args) {
        // Testing the Pandav class
        Person arjun = new Pandav();
        arjun.fight();          // Pandav is a fighter
        arjun.obey();           // Pandav obeys
        arjun.showKindness();   // Pandav shows kindness

        System.out.println();

        // Testing the Kaurav class
        Person duryodhan = new Kaurav();
        duryodhan.fight();      // Kaurav is a fighter
        duryodhan.obey();       // Kaurav disobeys
        duryodhan.showKindness(); // Kaurav is cruel

        System.out.println();

        // Testing the Vikarn class
        Person vikarn = new Vikarn();
        vikarn.fight();         // Vikarn is a fighter
        vikarn.obey();          // Vikarn obeys
        vikarn.showKindness();  // Vikarn shows kindness
    }
}
