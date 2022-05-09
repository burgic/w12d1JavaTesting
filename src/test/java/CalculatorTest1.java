import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest1<pubic> {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test

    public void canAdd(){
        assertEquals( 12, calculator.addNumbers(5, 7));
    }

    @Test
    public void canSubtract() {
        assertEquals(12, calculator.subtractNumbers(18,6));
    }

    @Test
    public void canDivide() {
        assertEquals(12, calculator.divideNumbers(24, 2), 0.0);
    }

    @Test
    public void canMulitply() {
        assertEquals(12, calculator.multiplyNumbers(6, 2));
    }
}
