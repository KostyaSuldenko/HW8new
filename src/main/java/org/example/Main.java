package org.example;

public class Main {
    public static void main(String[] args) {

        Shape Rectangle = new Rectangle();
        Shape Square = new Square();
        Shape Triangle = new Triangle();
        Shape Circle = new Circle();
        Shape Ellipse = new Ellipse();

        ShapePrinter.shapePrintName(Rectangle);
        ShapePrinter.shapePrintName(Square);
        ShapePrinter.shapePrintName(Triangle);
        ShapePrinter.shapePrintName(Circle);
        ShapePrinter.shapePrintName(Ellipse);

    }
}
