package day46_Final_Abstract.ShapeTask;

public final class Circle  extends Shape{//cannot be inherited now

    //regular class must override abstract methods

    public double radius;
    public static double pi = 3.14;


    public Circle(double radius){

        this.radius = radius;

    }

    // area(); ==> radius * radius *pi;
    @Override
    public void area(){

        double area = radius * radius * pi;

        System.out.println("The area of circle is "+area);
    }


}

