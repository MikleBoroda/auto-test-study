package lesson11.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Agetest {
    @Test
    public void ageTest(){
        Human human = new Human();
        human.setAge(20);
        Assertions.assertEquals(human.getAge(), 20);
    }
}
