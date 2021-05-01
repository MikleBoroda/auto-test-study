package leson1;

public class Plowadrectangl {
    int width;
    int heght;

    boolean plowad() {
        double sRec = width * heght;
        int pRec = 2 * (width + heght);
        return sRec > pRec;

    }

    void setStoroni(int shirina, int visota) {
        width = shirina;
        heght = visota;
    }

    public static void main(String[] args) {
        Plowadrectangl pl1 = new Plowadrectangl();
        Plowadrectangl pl2 = new Plowadrectangl();
        Plowadrectangl pl3 = new Plowadrectangl();
        pl1.setStoroni(2, 7);
        pl2.setStoroni(6, 5);
        pl3.setStoroni(6, 3);

        System.out.println(pl1.plowad());
        System.out.println(pl2.plowad());
        System.out.println(pl3.plowad());

    }

}
