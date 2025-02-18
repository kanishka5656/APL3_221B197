public abstract class Duck implements Swimmable
{
    @Override
    public void swim()
    {
        System.out.println(getClass().getSimpleName() + " is swimming.");
    }
}
