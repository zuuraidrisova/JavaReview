package day33_CustomClass;

public class Car {

    /*
    car class:

                data/Attributes:
                            brand, model, year, color, mileage

                 actions/functions :
                                drive(), stop(), etc...

       Instance variables ==> part of objects, object variables
                                  declared outside the blocks or methods,
                                  can be used outside
                                  dont have to initialize
                                  each object has its own copy

       Instance methods ==> object methods, do not have static specifier
                            they tell objects how to behave
                        because static means it belongs to class
                        instance method belongs to objects
                        ==> it also has return type, access modifiers, method name,

      public String toString(){} ==> this method prints object the way you want
      ```````when u pass the object into print statement

     */


    String brand; //instance variables
    String model;
    int year;
    String color;
    long mileage;

    public void setCarInfo(String brand, String model,int year, String color, long mileage){

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
    }
    public void start(){

        System.out.println(brand+" is starting");
    }

    public void drive(){

        System.out.println("Driving "+brand+" "+model);
    }

    public void stop(){

        System.out.println(brand+" is stopping");
    }

    public void getCarInfo() {

        System.out.println(brand+" "+model+" "+year+" "+color+" "+mileage);

    }

    public String toString(){

        String result = brand+" "+model+" "+year+" "+color+" "+mileage;

        return result;
    }
}
