package day46_Final_Abstract.ShapeTask;

public final class Triangle extends Shape{ //cannot be inherited now

    public double base;
    public double height;

    public Triangle(double base, double height){

        this.base = base;
        this.height = height;

    }

    //area(); ==> base * height * 1/2
    @Override
    public void area(){

        double area = base * height * 1/2;

        System.out.println("The area of triangle is "+area);
    }
}
