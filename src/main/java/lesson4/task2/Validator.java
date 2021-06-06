package lesson4.task2;


public class Validator {

    private static final String VALIDATOR_STRING = "^(\\S+) (\\S+) (\\S+)$";


    public static boolean getValidFormatString(String formatString) {
        boolean outPutStringFormat = formatString.matches(VALIDATOR_STRING);
        String setFormat = outPutStringFormat ? "Ввалидная строка" :
                "Строка не валидная";
        System.out.println(setFormat);
        return outPutStringFormat;
    }

    public static String[] getSplit(String putString) {
        return putString.split(" ");
    }

    public static boolean getValidHuman(Human human) {
        boolean validHuman = human.getLastName() != null && human.getFirstName() != null && human.getBirthDate() != null;
        String outPutHuman = validHuman ? "Валидный человек" : "Не валидный человек";
        return validHuman;
    }

    public static boolean arrayHuman(Human[] humanArray) {

        boolean arrayHumanFull = true;
        for (Human humans : humanArray) {
            if (humans == null) {
                arrayHumanFull = false;
                break;
            }
        }

        String outArrayHuman = arrayHumanFull ? "Массив заполнен не полностью и валиден" :
                "Массив не валиден т к переполнен";
        return arrayHumanFull;
    }


}
