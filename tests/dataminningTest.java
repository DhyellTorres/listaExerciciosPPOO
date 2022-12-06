package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import dataMinning.dataMinning.*;

public class dataminningTest {

    @Test
    public void dataMinningTest() {
        DataTemplate dataTemplate = new PDF("data1.pdf");

        assertEquals("data1.pdf", new PDF("data1.pdf").getPath());
    }
}
