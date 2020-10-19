package day46_Final_Abstract.ShapeTask;

public final class Square  extends Shape{//cannot be inherited now

    public double side;

    public Square(double side){

        this.side = side;
    }

    //area(); ==> side * side

    @Override
    public void area(){

        double area = side * side;

        System.out.println("The area od square is "+area);
    }




}
