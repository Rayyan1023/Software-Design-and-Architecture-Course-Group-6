/*Rayyan Mohammed 100752351
Daniyal Khan 100750029
Muhammad Khalid 100746801
Juan Gaviriarojas
 */

public class Client {

    public static void main(String[] args) {

        ProductFactory ClothesFactory = FactoryProducer.getFactory(false);

        Clothes sweater1 = clothesFactory.getClothes("SWEATER");

        Clothes hoodie1 = clothesFactory.getClothes("HOODIE");

        ProductFactory ClothesFactory2 = FactoryProducer.getFactory(true);

        Clothes sweater2 = clothesFactory2.getClothes("Sweater");

        Furniture hoodie2 = clothesFactory2.getClothes("Hoodie");
    }
}
