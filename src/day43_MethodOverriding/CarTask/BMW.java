package day43_MethodOverriding.CarTask;

public class BMW extends Car {

    @Override
    public void start(){

        System.out.println("Call some friends\nTell them to push" +
                "\nRemove clutch peddle suddenly");

    }
}
