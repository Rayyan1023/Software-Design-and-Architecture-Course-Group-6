import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FancyHoodieTest {
    private double hoodiePrice;

    @BeforeEach
    void setUp() {
        
        JSON jsonHoodie = new JSON("Fancy Hoodie");
        hoodiePrice = jsonHoodie.getJson();
    }

    @Test
    void setPrice() {

       
        ProductFactory clothesFactory = FactoryProducer.getFactory(true);
        Clothes hoodie = clothesFactory.getClothes("HOODIE");

        
        assertEquals(200, hoodiePrice, 0);
    }
}
