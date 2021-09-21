import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FancySweaterTest {
    private double sweaterPrice;

    @BeforeEach
    void setUp() {
        
        JSON jsonSweater = new JSON("Fancy Sweater");
        sweaterPrice = jsonSweater.getJson();
    }

    @Test
    void setPrice() {
        
        ProductFactory ClothesFactory = FactoryProducer.getFactory(true);
        Clothes sweater1 = clothesFactory.getClothes("SWEATER");

   
        assertEquals(100.00, sweatherPrice, 0);
    }
}
