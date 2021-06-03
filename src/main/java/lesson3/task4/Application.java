package lesson3.task4;

public class Application {

    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human valery = new Human("Валерий");
        Human stanislav = new Human("Станислав");
        Human egor = new Human("Егор");
        Human grigoriy = new Human("Григорий");
        Human alexandr = new Human("Александр");
        Human mihail = new Human("Михаил");

        sergey.addFriends(valery);
        stanislav.addFriends(valery);
        stanislav.addFriends(mihail);
        grigoriy.addFriends(sergey);
        grigoriy.addFriends(egor);
        grigoriy.addFriends(alexandr);
        alexandr.addFriends(egor);
        alexandr.addFriends(mihail);

        System.out.println(areFriendShip(sergey,grigoriy));
        System.out.println(areFriendShip(mihail,grigoriy));
        System.out.println(areFriendShip(sergey,grigoriy));
        System.out.println(areFriendShip(egor,valery));

    }

    static boolean areFriendShip(Human human1, Human human2){
        return human1.friendsExist(human2);
    }
}
