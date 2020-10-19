package day43_MethodOverriding.ShapeTask;

public class Circle extends Shape {

    /*
     create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area,
      perimeter, of those shapes
     */


    public double radius;
    public static double pi = 3.14;



    public Circle(double radius){

        this.radius = radius;
    }

    // formula to identify  Area of the circle:    3.14 * radius * radius

    @Override
    public void calculateArea(){

        area = radius * radius * pi;

        System.out.println("Area of Circle: "+area);
    }

    //formula to identify  Perimeter of circle:   3.14 * 2 * radius

    @Override
    public void calculatePerimeter(){

        perimeter =  pi * 2 * radius;

        System.out.println("Perimeter of Circle: "+perimeter);
    }


}
