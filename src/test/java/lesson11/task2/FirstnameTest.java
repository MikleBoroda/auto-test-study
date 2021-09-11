package lesson11.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstnameTest {
    @Test
    public void firstNameTest(){
        Human human = new Human();
        human.setFirstName("Иван");
        Assertions.assertEquals(human.getFirstName(), "Иван");
//        Assertions.assertEquals(human.getFirstname(), "Ив");
//        Assertions.assertEquals(human.getFirstname(), "Ивансдлиннымименем");
//        Assertions.assertEquals(human.getFirstname(), "Иван5аа");
    }
}

