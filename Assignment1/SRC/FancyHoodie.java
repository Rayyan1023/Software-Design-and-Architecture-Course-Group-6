public class FancyHoodie implements Clothes{
    private double price;
    @Override
    public double setPrice(double price){
        this.price = price;
        this.display();
        return this.price;
    }
    
    @Override
    public void display(){
        System.out.println("The Fancy Hoodie costs: " + this.price);
    }
}
