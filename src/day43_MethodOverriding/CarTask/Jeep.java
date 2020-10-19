package day43_MethodOverriding.CarTask;

public class Jeep  extends Car{

    @Override
    public void start(){

        System.out.println("Call mechanic to start");
        System.out.println("Oil change");
        System.out.println("Jump to start");

    }
}
