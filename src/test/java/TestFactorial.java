import com.calculator.Factorial;
import com.calculator.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFactorial {
    Operation op;
    @Test
    public void testFactorial() {
        op = new Factorial();
        assertEquals(24, op.calculate(4,4), 0);
    }
}
