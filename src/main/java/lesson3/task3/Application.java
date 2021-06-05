package lesson3.task3;

public class Application {
    public static void main(String[] args) {

        //дедушка и бабушка
        Human valeriy = new Human("Валерий", 60, null, null);
        Human alexandra = new Human("Александра", 50, null, null);
        Human ivan = new Human("Иван", 65, null, null);

        //родители
        Human sergey = new Human("Сергей", 30, alexandra, valeriy);
        Human marina = new Human("Марина", 30, null, ivan);

        //дети
        Human vitaliy = new Human("Виталий", 15, marina, sergey);
        Human elena = new Human("Елена", 10, marina, sergey);

        Human[] grands = new Human[4];
        int index = 0;

        for (int i = 0; i < elena.parents.length; i++) {
            Human[] parentParents = elena.parents[i].parents;
            for (int j = 0; j < parentParents.length; j++) {
                grands[index++] = parentParents[j];
            }
        }

        for (Human grand : grands) {
            if (grand != null) System.out.printf("%s (%d лет)%n", grand.name, grand.age);
        }
    }
}
