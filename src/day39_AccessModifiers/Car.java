package day39_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {

    /*
    create a class called Car:
				instance variable:
						brand, model, year, price
				add a constructor that can initialize brand of car
				add a constructor that can initialize brand and model of the car
								(apply constructor call to initalize the brand)
				add a constructor that can initialize the brand, model, year of the car
								(apply constructor call to initialize brand, model)
				add a constructor that can initialize brand, model, year and price of the car
								(apply constructor call to initialize brand, model, year)
				add toString method

				this is called chain rules
     */

    String brand;
    String model;
    int year;
    long price;

    public Car(String brand){

        this.brand = brand;
    }

    public Car(String brand,String model){

        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, int year){

        this(brand, model);
        this.year = year;

    }

    public Car(String brand, String model, int year, long price){

        this(brand, model, year);
        this.price = price;

    }

    public String toString(){

        return "Brand: "+brand+", Model: "+model+", Year: "+year+", Price: "+price;
    }

}

class CarObject{

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        // only brand will be initialized, other variables will get default values

        System.out.println("car1 = " + car1);

        Car car2 = new Car("Toyota","Camry");
        // only brand  and model will be initialized, other variables will get default values

        System.out.println("car2 = " + car2);

        Car car3 = new Car("Toyota","Camry", 2012);
        // only brand, model and year  will be initialized, other variables will get default values

        System.out.println("car3 = " + car3);

        Car car4 = new Car("Toyota","Camry", 2012, 15000);
        // all variables will be initialized

        System.out.println("car4 = " + car4);

        System.out.println("============================================");

        ArrayList<Car> cars = new ArrayList<>();

        cars.addAll(Arrays.asList(car1,car2,car3,car4));

        for (Car each : cars){

            System.out.println(each);
        }

        System.out.println("============================================");

        for (int i = 0; i < cars.size(); i++){

            System.out.println(cars.get(i).model);
        }



    }
}