package leson1;

public class Radius {


    final double PI = 3.14;
    double radius;

    double area(){
        return PI * radius * radius;
    }

    void setRadius(double r){
        radius = r;
    }


    public static void main(String[] args) {
        Radius radius1 = new Radius();
        Radius radius2 = new Radius();
        Radius radius3 = new Radius();

        radius1.setRadius(0);
        radius2.setRadius(2);
        radius3.setRadius(100);
        System.out.println("Площадь окружности: " + radius1.area());
        System.out.println("Площадь окружности: " + radius2.area());
        System.out.println("Площадь окружности: " + radius3.area());





    }

}
