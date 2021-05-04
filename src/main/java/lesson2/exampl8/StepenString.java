package lesson2.exampl8;

import com.sun.codemodel.internal.fmt.JStaticFile;

public class StepenString {
    static String stepenReturn(int n) {
        switch (n) {
            case 1:
                return "A";
            case 2:
                return "AA";
            case 3:
                return "AAA";
            case 4:
                return "AAAA";
            default:
                return "AAAAA";

        }


    }

    static void stepenBreak(int n) {
        switch (n) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("AA");
                break;
            case 3:
                System.out.println("AAA");
                break;
            case 4:
                System.out.println("AAAA");
                break;
            default:
                System.out.println("AAAAA");


        }


    }

    public static void main(String[] args) {
        System.out.println(stepenReturn(-1));
        System.out.println(stepenReturn(2));
        System.out.println(stepenReturn(4));
        System.out.println(stepenReturn(7));
        System.out.println(stepenReturn(0));

        stepenBreak(-1);
        stepenBreak(2);
        stepenBreak(4);
        stepenBreak(7);
        stepenBreak(-1);


    }
}
