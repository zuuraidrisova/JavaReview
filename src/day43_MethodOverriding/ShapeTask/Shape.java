package day43_MethodOverriding.ShapeTask;

public class Shape {


    /*
    create a class called ShapeActions:
                methods: calculateArea(), calculatePerimeter()


                Area of the circle:    3.14 * radius * radius
                Area of the rectangle:  width * length
                Area of the square:    side * side
                Perimeter of circle:   3.14 * 2 * radius
                Perimeter of rectangle: (width + length) * 2
                Perimeter of Square: 4 * side



     */

    public double area;
    public double perimeter;

    public void calculateArea(){

        area = 0;

        System.out.println("Area of Shape "+area);

    }

    public void calculatePerimeter(){

        perimeter = 0;
        System.out.println("Perimeter of Shape "+perimeter);
    }


}

