package day43_MethodOverriding.ShapeTask;

public class Square  extends Shape{

    public double side;

    public Square(double side){

        this.side =side;
    }


    //Formula to identify the Area of the square:    side * side
    @Override
    public void calculateArea(){

        area = side * side;

        System.out.println("Area of Square: "+area);
    }

    //Formula to identify the Perimeter of Square: 4 * side
    @Override
    public void calculatePerimeter(){

        perimeter = side * 4;

        System.out.println("Perimeter of Square: "+perimeter);
    }

}
