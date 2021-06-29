package lesson6.task1;

import java.util.Random;

public class PhoneGenerator {
    public static String generate() {
        return String.format("+7(%s)%s-%s-%s", DigitRandom(3), DigitRandom(3), DigitRandom(2), DigitRandom(2));
    }

    private static String DigitRandom(int length) {
        String pattern = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }
}
