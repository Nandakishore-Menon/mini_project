import com.calculator.NaturalLog;
import com.calculator.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNaturalLog {
    Operation op;
    @Test
    public void testNaturalLog() {
        op = new NaturalLog();
        assertEquals(1.60943, op.calculate(5, 5), 0.0001);
    }
}
