package task3;

import lesson11.task3.Generator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomStringTest {

    @Test
    public void getRandomStringTest() {

        for (int i = 0; i < 10000; i++) {
            int startLength = new Random().nextInt(20 - 1) + 1;
            int endLength = new Random().nextInt(40 - 20 + 1) + 20;
            String result = Generator.randomString(startLength, endLength);

            Assertions.assertTrue(result.matches("^[A-Z,a-z]{1,40}.*$"));
        }

    }
}
