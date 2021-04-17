package leson1;

public class Logik {

    boolean logikPlus (boolean a, boolean b){

        return !(a | b);
    }

    boolean logikUmnoj (boolean a, boolean b){
        return !a & !b;
    }

    public static void main(String[] args) {
        Logik logik = new Logik();

        System.out.println("Входные данные false false: " + logik.logikPlus(false,false) + " " + logik.logikUmnoj(false,false));
        System.out.println("Входные данные false true: " + logik.logikPlus(false,true) + " " + logik.logikUmnoj(false,true));
        System.out.println("Входные данные true false: " + logik.logikPlus(true,false) + " " + logik.logikUmnoj(true,false));
        System.out.println("Входные данные true true: "  + logik.logikPlus(true,true) + " " + logik.logikUmnoj(true,true));
    }
}
