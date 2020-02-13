import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCalculatorTest {

    InsuranceCalculator calculator = new InsuranceCalculator();

    @Test
    void low() {
        assertEquals(1825, calculator.calculateInsurance(5000));
    }

    @Test
    void medium() {
        assertEquals(36600, calculator.calculateInsurance(15000));
    }

    @Test
    void high() {
        assertEquals(78500, calculator.calculateInsurance(50000));
    }

    @Test
    void veryHigh() {
        assertEquals(106000, calculator.calculateInsurance(80000));
    }

}