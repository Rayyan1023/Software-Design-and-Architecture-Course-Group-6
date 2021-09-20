import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoodieTest {
    private double hoodiePrice;
    @BeforeEach
    void setUp(){
        // Creates new json object, that gets the price of table from the json file
        JSON jsonHoodie = new JSON("hoodie");
        hoodiePrice = jsonHoodie.getJson();
    }

    @Test
    void setPrice() {
        // Creates new a classic table object, then sets the price that is based on the
        ProductFactory clothesFactory = FactoryProducer.getFactory(false);
        Clothes hoodie = clothesFactory.getClothes("HOODIE");

        // Compares the prices of the JSON file to that of the actual price
        assertEquals(100.00, hoodiePrice, 0);
    }
}
