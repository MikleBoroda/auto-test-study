package lesson5.task2;

public class Application {
    public static void main(String[] args) {

        Cat cat0 = new Cat("Мурзик", 12);
        Cat cat1 = new Cat("Барсик", 22);
        Cat cat3 = new Cat("Тигр", 123);
        Cat cat4 = new Cat("Мяу", 142);
        Cat[] cats = {cat0, cat1, null, cat3, cat4};

        for (
                Cat listCats : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", listCats.getName(), listCats.getAge());
            } catch (NullPointerException e) {
                System.out.println("Пустая ссылка NULL");
                break;
            }
        }
    }
}
