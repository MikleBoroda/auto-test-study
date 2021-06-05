package lesson3.task3;

public class Human {
    String name;
    int age;
    Human[] parents;

    public Human(String name, int age, Human mother, Human father) {
        this.name = name;
        this.age = age;
        this.parents = new Human[]{mother, father};
    }

}
