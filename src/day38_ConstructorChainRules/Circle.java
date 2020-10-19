package day38_ConstructorChainRules;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
      /*
     Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
     */

    double radius;
    static  double pi = 3.14;
    double diameter;

    public Circle(double radius){

        this.radius = radius;
        diameter = radius * 2 ;

    }

    public double area(){

        return radius * radius * pi;
    }

    public double perimeter(){

        return  diameter * pi;
    }

    public String toString(){

        return "radius of the circle is: "+radius+", area of circle is: "
                +area()+", perimeter of circle is: "+perimeter();
    }
}

class CircleObject{


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Please enter the radius of circle: ");
        double radius =  scanner.nextDouble();

        Circle circle1 = new Circle(radius);

        //df.format() ==> will round to 2 zeros
        System.out.println("circle1.area() = " + df.format(circle1.area()));
        System.out.println("circle1.diameter = " + df.format(circle1.diameter));
        System.out.println("circle1.perimeter() = " + df.format(circle1.perimeter()));

    }
}