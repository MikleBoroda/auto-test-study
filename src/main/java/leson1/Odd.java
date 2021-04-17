package leson1;

public class Odd {

    boolean chet(int chislo){
        return chislo % 2 == 1;
    }

    public static void main(String[] args) {
        Odd odd = new Odd();
        System.out.println(odd.chet(14));
        System.out.println(odd.chet(19));
    }


}
