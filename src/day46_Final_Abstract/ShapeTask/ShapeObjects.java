package day46_Final_Abstract.ShapeTask;

import java.text.DecimalFormat;

public class ShapeObjects {

    public static void main(String[] args) {

      // DecimalFormat df = new DecimalFormat("0.00");

        double radius = 3.3;

        Circle circle = new Circle(radius);

        circle.area();

        Square square = new Square(4);

        square.area();

        Triangle triangle = new Triangle(3,6);

        triangle.area();

        Rectangle rectangle = new Rectangle(2,3);

        rectangle.area();
    }
}
