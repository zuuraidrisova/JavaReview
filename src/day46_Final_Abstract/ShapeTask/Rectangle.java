package day46_Final_Abstract.ShapeTask;

public final class Rectangle extends Shape{//cannot be inherited now

    public double width;
    public double length;

    public Rectangle(double width, double length){

        this.width = width;
        this.length = length;
    }

    // area(); ==> width * length;
    @Override
    public void area(){

        double area =  width * length;

        System.out.println("The area of rectangle is "+area);
    }

}
