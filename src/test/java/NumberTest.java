import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTest {

    @Test
    public void add() {
        Number number = new Number(10);
        number.add(10);
        assertEquals(20, number.getVal());
    }

    @Test
    public void sub() {
        Number number = new Number(10);
        number.sub(10);
        assertEquals(0, number.getVal());
    }
}