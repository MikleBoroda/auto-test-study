package lesson9.task3;

import lesson9.task3.figures.RightTriangle;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            figures.add(Generator.ganerate());
        }

        for (Figure figure : figures
        ) {
            if (figure instanceof OneParameterFigure) {
                System.out.printf("%s [%d]: Длина - %.1f, Площадь - %.1f%n",
                        figure.getClass().getSimpleName(), figure.getParameter1(), figure.getLength(), figure.getArea());
            }

            if (figure instanceof TwoParameterFigure) {
                TwoParameterFigure twoParameterFigure = (TwoParameterFigure) figure;
                System.out.printf("%s [%d, %d]: Длина - %.1f, Площадь - %.1f.%n", figure.getClass().getSimpleName(),
                        figure.getParameter1(), twoParameterFigure.getParameter2(), figure.getLength(),
                        figure.getArea());
            }
        }

        for (Figure figure : figures
        ) {
            if (figure instanceof RightTriangle) {
                RightTriangle rightTriangle = (RightTriangle) figure;
                System.out.printf("Гипотенуза треугольника [%d, %d] равна %.1f.%n", figure.getParameter1(),
                        rightTriangle.getParameter2(), rightTriangle.getHypotenuse());
            }

        }

    }

}
