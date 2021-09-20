import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SweaterTest {
    private double sweaterPrice;

    @BeforeEach
    void setUp() {
        
        JSON jsonSweater = new JSON("sweater");
        sweaterPrice = jsonSweater.getJson();
    }

    @Test
    void setPrice() {
       
        ProductFactory clothesFactory = FactoryProducer.getFactory(false);
        Clothes sweater1 = ClothesFactory.getClothes("SWEATER");

      
        assertEquals(50.00, sweaterPrice, 0);
    }
}
