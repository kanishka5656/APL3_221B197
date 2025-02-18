public class LakeDuck extends Duck implements Flyable, Quackable
{
    @Override
    public void fly()
    {
        System.out.println("LakeDuck is flying!");
    }

    @Override
    public void quack()
    {
        System.out.println("LakeDuck quacks!");
    }
}
