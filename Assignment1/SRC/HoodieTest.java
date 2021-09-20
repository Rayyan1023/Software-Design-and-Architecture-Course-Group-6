import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoodieTest {
    private double hoodiePrice;
    @BeforeEach
    void setUp(){
      
        JSON jsonHoodie = new JSON("hoodie");
        hoodiePrice = jsonHoodie.getJson();
    }

    @Test
    void setPrice() {
       
        ProductFactory clothesFactory = FactoryProducer.getFactory(false);
        Clothes hoodie = clothesFactory.getClothes("HOODIE");

        
        assertEquals(100.00, Price, 0);
    }
}
