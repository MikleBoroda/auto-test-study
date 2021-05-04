package lesson2.exampl7;

public class ReturnInt {
    static String hmetod(int n) {
        if (n >= 25 && n < 44) return "Молодой возраст";
        if (n >= 44 && n < 60) return "Средний возраст";
        if (n >= 60 && n < 75) return "Пожилой возраст";
        if (n >= 75 && n < 90) return "Старческий возраст";
        else return "Неизвестный возраст";


    }

    public static void main(String[] args) {

        System.out.println(hmetod(32));
        System.out.println(hmetod(52));
        System.out.println(hmetod(66));
        System.out.println(hmetod(82));
        System.out.println(hmetod(25));
        System.out.println(hmetod(44));
        System.out.println(hmetod(60));
        System.out.println(hmetod(75));
        System.out.println(hmetod(22));
        System.out.println(hmetod(119));




    }
}
