abstract class Beverage{
    protected void pourBeverage(int qty){
        System.out.println("Pour"+ qty + " of Beverage into a glass");
    }
    protected abstract void addCondiment();
    
    protected void stir(){}
    
    private void serve(){
        System.out.println("Serve through Waiter");
    }
    
    public void final templateMethod(int qty){
        pourBeverage(qty);
        addCondiment();
        stir();
        serve();
        
    }
    
}