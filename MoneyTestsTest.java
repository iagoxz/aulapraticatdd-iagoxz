import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyTest {

    @Test
    public void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        Assertions.assertNotEquals(Money.dollar(5), Money.dollar(6));
        Assertions.assertNotEquals(Money.franc(5), Money.dollar(5));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}