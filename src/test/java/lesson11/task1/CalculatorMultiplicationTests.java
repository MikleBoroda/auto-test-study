package lesson11.task1;

import lesson11.tsk1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorMultiplicationTests {
    @Test
    public void calculateMultiplicationTest(){
        int product = Calculator.getMultiplication(3, 2);
        Assertions.assertEquals(6, product);

     product = Calculator.getMultiplication(1,2,3,4,5,6);
        Assertions.assertEquals(720, product);

        // negative Test
        product = Calculator.getMultiplication(1,2,3,4,5,6);
        Assertions.assertEquals(723, product);

    }
}
