package tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import cakes.*;

public class cakesTest {

    @Test
    public void testCake() {
        Order order = new Order();
        order.addCake(new VanillaCake());

        assertEquals(20.0, new VanillaCake().getPrice(), 0.0);
    }

    @Test
    public void testMultipleCakes() {
        Order order = new Order();
        order.addCake(new MultiLayered(new StrawBerryCake(new WithSprinkles(
                new WithSprinkles(new WithSaying(new WithSaying("EVERYTHING!"), "One of"))))));
        assertEquals(69.0, order.getTotal(), 0.0);
    }

}
