package lesson3.task2;
/**
 * Создание конструктора класса Cat
 * Создание и заполнение массива объектами экземпляра класса
 * Сортировка массива по имени
 */

import java.util.Arrays;
import java.util.Comparator;

public class Cat {
    int age;
    int weight;
    String name;

    Cat(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public static void main(String[] args) {

        Cat[] cat = new Cat[5];

        cat[0] = new Cat(2, 5, "Барсик");
        cat[1] = new Cat(3, 11, "Мурзик");
        cat[2] = new Cat(7, 2, "Матильда");
        cat[3] = new Cat(1, 3, "Леопольд");
        cat[4] = new Cat(2, 5, "Базилио");

        Arrays.sort(cat, new Comparator<Cat>() {
                    @Override
                    public int compare(Cat o1, Cat o2) {
                        return o1.name.compareTo(o2.name);
                    }
                }
        );

        for (Cat animal : cat) {
            System.out.printf("Имя: %s, Возраст: %d, Вес: %d%n", animal.name, animal.age, animal.weight);

        }
    }
}
