package day42_InheritanceContinue.task2;

public class TV extends Device {

    /*
   create a class called TV:

               attributes: brand, model, price, country, type, size inherited all
               setDeviceInfo() is inherited
               methods: watch no inherited, should be declared

               Constructor() to initialize variables, cannot be created
               because constructor should have same name as class
               method toString inherited

               TV is a device relationship
    */

    public TV(String brand, String model,double price, String country, String size){

        setDeviceInfo(brand, model, price, country,"TV",size);
        // we can call method to initialize variables

    }

    public void watch(){

        System.out.println("watching "+brand+" "+model);
    }
}

class TvObject{

    public static void main(String[] args) {

        TV obj = new TV("Vizio","Classic",200, "China","medium");

        System.out.println(obj);

        obj.watch();

    }
}