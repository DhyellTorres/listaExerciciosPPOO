package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import telephone.*;

public class telephoneTest {

    @Test
    public void telephoneTest() {
        PhoneModel model = new PhoneModel();

        model.addDigit(0);
        model.addDigit(1);
        model.addDigit(2);
        model.addDigit(3);

        assertEquals("0123", model.getDigitsToString());
        assertEquals("Agora discando 0123...", model.toString());
    }

}
