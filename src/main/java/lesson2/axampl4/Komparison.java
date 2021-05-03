package lesson2.axampl4;

import jdk.internal.dynalink.linker.ConversionComparator;

import java.util.ArrayList;
import java.util.Arrays;

public class Komparison {

    String comprationString(String s, String c) {
        String a = "";
        String k = "";
        char[] arr = s.toCharArray();


        for (int i = 0; i < arr.length; i++) {

            String b = String.valueOf(arr[i]);
            if (a.contains(b)) continue;
            if (c.contains(b)) a += b;

        }

        char[] arr2 = a.toCharArray();
        Arrays.sort(arr2);

        for (int i = 0; i < arr2.length; i++) {
            k += String.valueOf(arr2[i]);

        }
        return k;

    }

    public static void main(String[] args) {
        Komparison komparison = new Komparison();
        System.out.println(komparison.comprationString("Hello", "World"));
        System.out.println(komparison.comprationString("ping", "pong"));
        System.out.println(komparison.comprationString("qwer", "asdf"));
        System.out.println(komparison.comprationString("post", "get"));


    }


}





