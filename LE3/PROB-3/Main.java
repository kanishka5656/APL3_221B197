public class Main
{
    public static void main(String[] args)
    {
        Duck[] ducks = {
            new RubberDuck(),
            new WoodenDuck(),
            new RedHeadDuck(),
            new LakeDuck()
        };

        for(Duck duck : ducks)
        {
            duck.swim();
            if(duck instanceof Flyable)
            {
                ((Flyable) duck).fly();
            }
            if(duck instanceof Quackable)
            {
                ((Quackable) duck).quack();
            }
            
            System.out.println("----------------");
        }
    }
}
