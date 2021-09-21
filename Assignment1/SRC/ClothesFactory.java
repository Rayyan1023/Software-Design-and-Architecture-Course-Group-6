public class ClothesFactory extends ProductFactory {
    @Override
    public Clothes getClothes(String ClothesType) {
        if (ClothesType.equalsIgnoreCase("sweater")) {
            JSON jsonSweater = new JSON("sweater");
            double sweaterPrice = jsonSweater.getJson();
            Sweater sweater = new Sweater();
            sweater.setPrice(sweaterPrice);
            return sweater;
        } 
        
        
        else if (ClothesType.equalsIgnoreCase("hoodie")) {
            JSON jsonHoodie = new JSON("hoodie");
            double hoodiePrice = jsonHoodie.getJson();
            Hoodie hoodie = new Hoodie();
            hoodie.setPrice(hoodiePrice);
            return hoodie;
        }
        return null;
    }
}
