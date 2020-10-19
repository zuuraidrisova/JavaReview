package day48_Interface;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Phone {

    /*
   Warmup tasks:
   1. create an abstract class called Phone
           attributes: brand, model, price, size
           abstract methods: calling(), texting()
           instance method: toString()
   2. create the following subclasses of phone:
                       1. iPhone
                       2. Samsung
           create constructors in each sub class that can initialize the instance variables
    */
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling(long phoneNumber);

    public abstract void texting(long phoneNumber);

    public String toString(){

        return brand+" "+model+" "+price+" "+size;
    }

}

class Iphone extends Phone{

    static {

        brand = "Iphone";
    }
    public Iphone(String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;

    }

    public void facetime(long phoneNumber){

        System.out.println(phoneNumber+" is facetiming");
    }

    @Override
    public void calling(long phoneNumber) {

        System.out.println(brand+ " Calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {

        System.out.println(brand+ " Texting "+phoneNumber);
    }
}

class Samsung extends Phone{

    static {

        brand = "Samsung";
    }

    public Samsung(String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;

    }

    @Override
    public void calling(long phoneNumber) {

        System.out.println(brand+ " Calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {

        System.out.println(brand+" Texting "+phoneNumber);
    }


}

class PhoneObjects{

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("XR",850,"medium");

        System.out.println("iphone1 = " + iphone1);

        Iphone iphone2 = new Iphone("9",900,"8 inches");

        System.out.println("iphone2 = " + iphone2);

        Iphone iphone3 = new Iphone("XS",440, "small");

        System.out.println("iphone3 = " + iphone3);

        System.out.println("==============================================");

        ArrayList<Iphone> iphones = new ArrayList<>(Arrays.asList(iphone1,iphone2,iphone3));

        for (Iphone each: iphones){

            each.calling(76342585);
            System.out.println("***************");
            each.facetime(821234213);
            System.out.println("***************");
            each.texting(813264323);
            System.out.println("***************");
        }


        System.out.println("==============================================");

        Samsung samsung1 = new Samsung("10",550,"medium");

        System.out.println("samsung1 = " + samsung1);

        Samsung samsung2 = new Samsung("12",600,"small");

        System.out.println("samsung2 = " + samsung2);

        System.out.println("==============================================");

        samsung1.calling(834162);
        samsung2.texting(8342962);


    }
}