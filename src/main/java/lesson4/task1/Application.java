package lesson4.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Application {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Human human = new Human();
        human.setLastName("Иванов");
        human.setLastName("Ива");
        human.setLastName("Ив");
        human.setLastName("Iва5");
        human.setLastName("iванов");
        human.setLastName("");

        human.setFirstName("Иван");
        human.setFirstName("Iван");
        human.setFirstName("Пе");
        human.setFirstName("Иван ");
        human.setFirstName(" петр");
        human.setFirstName(" Петr");
        human.setFirstName("");

        human.setBirthDate(sdf.parse("12.03.0000"));
        human.setBirthDate(sdf.parse("12.03.1961"));
        human.setBirthDate(sdf.parse("12.03.2961"));


    }
}
