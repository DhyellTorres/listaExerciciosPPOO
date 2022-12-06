package tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import orders.*;

public class storeItemTest {

    @Test
    public void testStoreItem() {
        StoreItem item = new Product("item1", 10.0);
        assertEquals("item1", item.getName());
        assertEquals(10.0, item.getPrice(), 0.0);
    }

    @Test
    public void testMultipleStoreItem() {
        Product item1 = new Product("item1", 10.0);
        Product item2 = new Product("item2", 20.0);
        Box box = new Box("box1", 30.0);
        box.addItem(item1);
        box.addItem(item2);
        assertEquals(30.0, box.getPrice(), 0.0);

    }

}
