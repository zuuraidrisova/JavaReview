package day51_OOP_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Shape {

    /*
    warmup tasks:
    1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
    2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double
    3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)
    4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initializes the name to "Circle"
                set a constructor that can initialize the radius
    5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Cylinder"
                set a constructor that can initialize the radius and height
    6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects

    Note:   Volume of Cylinder = PI * radius * radius * height
          Area of Cylinder = (PI * 2 * radius * radius) + (height * PI * 2 * radius);
          Perimeter of Cylinder = 2 * (PI * diameter + height)

            Area of Circle = PI * radius * radius
            Perimeter of Circle = 2 * radius * PI
     */

    public String name;


    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}

interface Volume{

    boolean hasVolume = true;//public static final by default

    double calculateVolume(); //abstract and public by default



}

interface PI{

    double pi = 3.14;//public static final by default

}

final class Circle extends Shape implements PI{

    public double radius;

    public Circle(double radius){

        this.radius = radius;
        name = "Circle";

    }


    //Area of Circle = PI * radius * radius
    @Override
    public double calculateArea() {

        double area = pi * radius * radius;

        return area;
    }

    //Perimeter of Circle = 2 * radius * PI
    @Override
    public double calculatePerimeter() {

        double perimeter = 2 * radius * pi;

        return perimeter;
    }
}

final class Cylinder extends Shape implements Volume, PI{

   public double radius;
   public double height;


   public Cylinder(double radius, double height){

       this.radius = radius;
       this.height = height;
       name = "Cylinder";
   }

    //   Area of Cylinder = (PI * 2 * radius * radius) + (height * PI * 2 * radius);

    @Override
    public double calculateArea() {

       double area = (pi * 2 * radius * radius) + (height * pi * 2 * radius);

       return area;
    }

    //    Perimeter of Cylinder = 2 * (PI * diameter + height)

    @Override
    public double calculatePerimeter() {

       double perimeter = 2 * (pi  * 2 * radius * height);

       return perimeter;
    }

    @Override
    public double calculateVolume() {

        return pi * radius * radius * height;
    }


}

class ShapeObjects{

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        Cylinder cylinder1 = new Cylinder(3.0,5);
        Cylinder cylinder2 = new Cylinder(2.5,4);


        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.addAll(Arrays.asList(circle1,circle2,cylinder1,cylinder2));

        for (Shape each :  shapes){

            System.out.println(each.name +" "+ each.calculateArea());
        }

        System.out.println("================================================");

        Shape shape = new Circle(6);

        double areaCircle =  ((Circle) shape).calculateArea();//downcasting

        System.out.println("areaCircle = " + areaCircle);

        System.out.println("================================================");


       double areaCylinder =  (( Cylinder) shapes.get(2)).calculateArea(); //downcasting

        System.out.println("areaCylinder = " + areaCylinder);

    }
}