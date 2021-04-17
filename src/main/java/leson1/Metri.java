package leson1;

public class Metri {
    int vozvrat(int sm){

        return sm / 100;
    }

    public static void main(String[] args) {
        Metri metri = new Metri();
        System.out.println(metri.vozvrat(115));
        System.out.println(metri.vozvrat(800));
        System.out.println(metri.vozvrat(278));

    }
}
