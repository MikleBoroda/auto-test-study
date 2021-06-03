package lesson3.task4;

public class Human {

    private String name;
    Human[] friends = new Human[4];

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFriends(Human other) {
        boolean added = friendsExist(other);
        if (!added) {
            int index = getPositionForFriend();
            friends[index] = other;
            other.addFriends(this);
        }
    }

     boolean friendsExist(Human human) {
        for (Human friend : friends) {
            if (friend == human) {
                return true;
            }
        }
        return false;
    }

    private int getPositionForFriend() {
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] == null) {
                return i;
            }
        }
        throw new IllegalStateException("Массив переполнен");
    }
}
