import org.junit.Test;

import rvt.Money;

import static org.junit.Assert.assertEquals;



public class MoneyTest {

    @Test
    public void testPlusMethod() {
        Money mac1 = new Money(10, 50);
        Money mac2 = new Money(5, 50);
        Money mac3 = mac1.plus(mac2);

        assertEquals(15, mac3.euros());
        assertEquals(100, mac3.cents());

        Money mac4 = new Money(1, 99);
        Money mac5 = new Money(2, 99);
        Money mac6 = mac4.plus(mac5);

        assertEquals(4, mac6.euros());
        assertEquals(98, mac3.cents());
    }

    @Test
    public void isMoneyEqual() {
        Money mon1 = new Money(5, 4);
        Money mon2 = new Money(40, 60);

        assertEquals(mon1, mon2);
    }
}