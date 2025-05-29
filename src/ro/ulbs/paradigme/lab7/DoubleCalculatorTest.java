package ro.ulbs.paradigme.lab7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleCalculatorTest {

    @Test
    public void testAdd() {
        DoubleCalculator calc = new DoubleCalculator(10.5);
        double result = (Double) calc.add(4.5).result();
        assertEquals(15.0, result, 0.0001);
    }

    @Test
    public void testSubtract() {
        DoubleCalculator calc = new DoubleCalculator(10.0);
        double result = (Double) calc.subtract(3.0).result();
        assertEquals(7.0, result, 0.0001);
    }

    @Test
    public void testMultiply() {
        DoubleCalculator calc = new DoubleCalculator(2.5);
        double result = (Double) calc.multiply(4.0).result();
        assertEquals(10.0, result, 0.0001);
    }

    @Test
    public void testMultiplyWithZero() {
        DoubleCalculator calc = new DoubleCalculator(7.8);
        double result = (Double) calc.multiply(0).result();
        assertEquals(0.0, result, 0.0001);
    }
}
