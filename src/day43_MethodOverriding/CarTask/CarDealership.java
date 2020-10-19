package day43_MethodOverriding.CarTask;

public class CarDealership {

    public static void main(String[] args) {

        Tesla tesla = new Tesla();

        tesla.start();

        System.out.println("===========================================");

        BMW bmw = new BMW();

        bmw.start();

        System.out.println("===========================================");

        Jeep jeep = new Jeep();

        jeep.start();

        System.out.println("===========================================");

        Honda honda = new Honda();

        honda.start(); //the original function will print




    }
}
