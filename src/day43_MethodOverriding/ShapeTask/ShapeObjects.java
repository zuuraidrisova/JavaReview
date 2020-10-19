package day43_MethodOverriding.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println("circle1.radius = " + circle1.radius);

        circle1.calculateArea();

        circle1.calculatePerimeter();

        System.out.println("===================================================");

        Rectangle rectangle1 = new Rectangle(3,2);

        System.out.println("rectangle1.length = " + rectangle1.length);
        System.out.println("rectangle1.width = " + rectangle1.width);

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println("===================================================");

        Square square1 = new Square(4);

        System.out.println("square1.side = " + square1.side);

        square1.calculateArea();
        square1.calculatePerimeter();


    }
}
