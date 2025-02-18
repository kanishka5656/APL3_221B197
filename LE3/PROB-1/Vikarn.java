// Special class for Vikarn who is a noble Kaurav
class Vikarn extends Kaurav {
    // Vikarn is a noble Kaurav, so we override his characteristics
    @Override
    void obey() {
        System.out.println("Vikarn is obedient, unlike other Kauravs.");
    }

    @Override
    void showKindness() {
        System.out.println("Vikarn shows kindness, unlike other Kauravs.");
    }
}
