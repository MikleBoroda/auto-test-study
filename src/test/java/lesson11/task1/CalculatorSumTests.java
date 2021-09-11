package lesson11.task1;

import lesson11.tsk1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorSumTests {
    @Test

    public void sumTest(){
        int sum = Calculator.getsum(2,3);
        Assertions.assertEquals(5, sum);

        sum = Calculator.getMultiplication(5,3, 10);
        Assertions.assertEquals(18, sum);

        //негативный тест
         sum = Calculator.getsum(5,3);
        Assertions.assertEquals(7, sum);


    }
}
