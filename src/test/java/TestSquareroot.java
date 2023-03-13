import static org.junit.Assert.assertEquals;
import com.calculator.*;
import org.junit.Test;

public class TestSquareroot {

  Operation op;
  @Test
  public void testSquarerootCalculate() {
    op = new Squareroot();
    assertEquals(6, op.calculate(36, 36), 0);
    assertEquals(0, op.calculate(0, 0), 0);
  }
}
