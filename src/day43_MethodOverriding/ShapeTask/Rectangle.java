package day43_MethodOverriding.ShapeTask;

public class Rectangle extends Shape {

    public double width;
    public double length;

    public Rectangle(double width, double length){

        this.width = width;
        this.length = length;

    }

    //Formula to identify Area of the rectangle:  width * length

    @Override
    public void calculateArea(){

        area = width * length;

        System.out.println("Area of Rectangle: "+area);
    }

    // Formula to identify Perimeter of rectangle: (width + length) * 2

    @Override
    public void calculatePerimeter(){

        perimeter = (width + length) * 2;

        System.out.println("Perimeter of Rectangle: "+perimeter);
    }
}
