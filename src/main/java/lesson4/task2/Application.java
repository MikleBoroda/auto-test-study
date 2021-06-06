package lesson4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws IOException, ParseException {
        Human[] humans = new Human[2];
        int index = 0;

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputValidString = reader.readLine();
            boolean validInput = Validator.getValidFormatString(inputValidString);

            if (!validInput) {
                continue;
            }

            String[] humanArray = Validator.getSplit(inputValidString);
            Human human = new Human();
            human.setFirstName(humanArray[0]);
            human.setLastName(humanArray[1]);
            human.setBirthDate(sdf.parse(humanArray[2]));

            boolean humanValid = Validator.getValidHuman(human);
            if (!humanValid) {
                continue;
            }

            humans[index++] = human;

            boolean arrFull = Validator.arrayHuman(humans);

            if (arrFull) break;


        }

    }
}
