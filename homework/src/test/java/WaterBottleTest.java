import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class WaterBottleTest {
    @Test
    public void hasVolume(){
        WaterBottle bottle = new WaterBottle(100);
        assertEquals(90, bottle.getDrink());
    }
    @Test
    public void empty(){
        WaterBottle bottle = new WaterBottle(100);
        assertEquals(0, bottle.empty());
    }
    @Test
    public void fill(){
        WaterBottle bottle = new WaterBottle(100);
        bottle.empty();
        assertEquals(100, bottle.fill());
    }


}
