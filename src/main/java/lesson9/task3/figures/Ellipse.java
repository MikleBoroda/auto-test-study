package lesson9.task3.figures;

import lesson9.task3.TwoParameterFigure;

public class Ellipse extends TwoParameterFigure {

    @Override
    public double getArea() {
        return Math.PI * parameter1 * parameter2;
    }

    @Override
    public double getLength() {
        return 4d * ((Math.PI + (parameter1 - parameter2) * (parameter1 - parameter2)) / (parameter1 + parameter2));
    }

}
