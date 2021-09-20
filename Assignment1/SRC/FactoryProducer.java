public class FactoryProducer {
    public static ProductFactory getFactory(boolean fancy){
        if(fancy){

            return new FancyClothesFactory();
        }
        
        else{
            return new ClothesFactory();
        }
    }
}
