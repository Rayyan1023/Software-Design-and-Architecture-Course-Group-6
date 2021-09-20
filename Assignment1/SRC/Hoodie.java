public class Hoodie implements Clothes {
    private double price;
    @Override
    public double setPrice(double price) {
        this.price = price;
        this.display();
        return this.price;
    }
    
    @Override
    public void display(){
        System.out.println("The price of the Hoodie is: " + this.price);    
    }
}
