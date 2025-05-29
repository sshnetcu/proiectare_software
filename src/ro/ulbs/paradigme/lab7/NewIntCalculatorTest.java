package ro.ulbs.paradigme.lab7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewIntCalculatorTest {

    @Test
    public void testAdd() {
        NewIntCalculator calc = new NewIntCalculator(10);
        int result = (Integer) calc.add(5).result();
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        NewIntCalculator calc = new NewIntCalculator(20);
        int result = (Integer) calc.subtract(8).result();
        assertEquals(12, result);
    }

    @Test
    public void testMultiply() {
        NewIntCalculator calc = new NewIntCalculator(5);
        int result = (Integer) calc.multiply(4).result();
        assertEquals(20, result);
    }

    @Test
    public void testMultiplyWithZero() {
        NewIntCalculator calc = new NewIntCalculator(5);
        int result = (Integer) calc.multiply(0).result();
        assertEquals(0, result);
    }
}
