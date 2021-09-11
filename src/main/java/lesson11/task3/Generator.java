package lesson11.task3;

import java.util.Random;

public class Generator {
    private static final String ENG_SMALL = "abcdefghijklmnopqrstuvwxyz";
    private static final String ENG_BIG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static int randomInteger(int start, int end) {

        return new Random().nextInt(end - start) + 1;
    }

    public static String randomString(int startLength, int endLength) {
        int stringLength = new Random().nextInt(endLength - startLength) + 1;
        StringBuilder sb = new StringBuilder();
        boolean flag = new Random().nextBoolean();

        for (int i = 0; i < stringLength; i++) {
            int index = new Random().nextInt(ENG_SMALL.length());
            if (flag) {
                sb.append(ENG_SMALL.charAt(index));
                continue;
            }
            sb.append(ENG_BIG.charAt(index));
        }

        return sb.toString();
    }
}