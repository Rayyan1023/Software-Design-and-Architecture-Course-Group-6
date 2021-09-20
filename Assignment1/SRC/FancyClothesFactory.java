public class FancyClothesFactory extends ProductFactory {
    @Override
    public Clothes getClothes(String ClothesType){
        if(ClothesType.equalsIgnoreCase("SWEATER")){
            JSON jsonSweater = new JSON("Fancy Sweater");
            double sweaterPrice = jsonSweater.getJson();
            FancySweater sweater = new FancySweater();
            sweater.setPrice(sweaterPrice);
            return sweater;
        }
        
        
        else if(clothesType.equalsIgnoreCase("HOODIE")){
            JSON jsonChair = new JSON("Fancy Hoodie");
            double hoodiePrice = jsonHoodie.getJson();
            FancyHoodie hoodie = new FancyHoodie();
            hoodie.setPrice(hoodiePrice);
            return hoodie;
        }
        return null;
    }
}
