import com.calculator.Calculator;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class CalcTest {

    Calculator calculator = new Calculator();
    @Test
    public void testAdd() throws Exception {
        double result = calculator.add(2.0, 2.0);
        assertEquals(4.0, result);
    }
    @Test
    public void testSubtract() throws Exception {
        double result = calculator.subtract(2.0, 2.0);
        assertEquals(0.0, result);
    }
    @Test
    public void testMultiply() throws Exception {
        double result = calculator.multiply(5.0, 2.0);
        assertEquals(10.0, result);
    }
    @Test
    public void testDivide() throws Exception {
        double result = calculator.divide(2.0, 2.0);
        assertEquals(1.0, result);
    }
    @Test
    public void testDivideByZero() throws Exception {
        double result = calculator.divide(2.0, 0.0);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }
}