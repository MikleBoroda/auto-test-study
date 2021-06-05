package lesson3.task5;

import com.sun.codemodel.internal.util.UnicodeEscapeWriter;

import java.util.Random;

public class Names {
    static final String[] HUMAN_NAME = {"Сергей", "Владимир", "Анатолий", "Анна", "Светлана", "Дмитрий", "Егор"};
    static final String[] CAT_NAME = {"Барсик", "Мурка", "Гавр"};
    static final String[] DOG_NAME = {"Рекс", "Мухтар", "Дик"};

    static String getRandomHumanName() {
        return HUMAN_NAME[new Random().nextInt(HUMAN_NAME.length)];
    }

    static String getRandomCatName() {
        return CAT_NAME[new Random().nextInt(CAT_NAME.length)];
    }

    static String getRandomDogName() {
        return DOG_NAME[new Random().nextInt(DOG_NAME.length)];
    }

}
