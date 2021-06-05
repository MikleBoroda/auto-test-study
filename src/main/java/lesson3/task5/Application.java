package lesson3.task5;

import java.util.Random;

public class Application {

    public static void main(String[] args) {

        Human[] humans = new Human[20];

        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
        }

        for (Human human : humans) {
            for (Human other : humans) {
                if (human != other && human.cats.length == other.cats.length && human.dogs.length == other.dogs.length) {
                    System.out.printf("%s: %d кошек, %d собак%n", human.name, human.cats.length, human.dogs.length);
                }
            }
        }
    }

}
