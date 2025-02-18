public class RedHeadDuck extends Duck implements Flyable, Quackable
{
    @Override
    public void fly()
    {
        System.out.println("RedHeadDuck is flying!");
    }

    @Override
    public void quack()
    {
        System.out.println("RedHeadDuck quacks!");
    }
}
