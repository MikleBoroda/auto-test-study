package leson1;

public class Sxema {

    boolean logikSxema ( boolean a, boolean b, boolean c, boolean d){
        return a & b & !c & !d;
    }

    public static void main(String[] args) {
        Sxema sxema = new Sxema();
        System.out.println(sxema.logikSxema(false,false,false,false));
        System.out.println(sxema.logikSxema(true,true,true,true));
        System.out.println(sxema.logikSxema(false,true,false,true));
        System.out.println(sxema.logikSxema(true,false,true,false));
        System.out.println(sxema.logikSxema(true,true,false,false));

    }
}
