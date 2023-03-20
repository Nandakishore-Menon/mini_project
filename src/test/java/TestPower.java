import com.calculator.Operation;
import com.calculator.Power;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPower {
    Operation op;
    @Test
    public void testPower() {
        op = new Power();
        assertEquals(81, op.calculate(3, 4), 0);
    }
}
