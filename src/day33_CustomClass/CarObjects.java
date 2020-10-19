package day33_CustomClass;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2012;
        car1.color = "White";
        car1.mileage = 120000;

        System.out.println("car1.brand = " + car1.brand);
        System.out.println("car1.model = " + car1.model);
        System.out.println("car1.year = " + car1.year);
        System.out.println("car1.color = " + car1.color);
        System.out.println("car1.mileage = " + car1.mileage);

        car1.start();
        car1.drive();
        car1.stop();
        car1.getCarInfo();

        System.out.println( "==============================================");

        Car car2 = new Car();

        car2.brand = "BMW";
        car2.model = "X5";
        car2.year = 2019;
        car2.color = "White";
        car2.mileage = 90000;

        System.out.println("car2.brand = " + car2.brand);
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.year = " + car2.year);
        System.out.println("car2.color = " + car2.color);
        System.out.println("car2.mileage = " + car2.mileage);

        car2.start();
        car2.drive();
        car2.stop();
        car2.getCarInfo();

        System.out.println( "==============================================");

        Car car3 = new Car();

        car3.setCarInfo("Toyota","Corolla", 2020, "black", 10000);

        Car car4 = new Car();

        car4.setCarInfo("Nissan", "IDK", 2015,"gold",120000);

        Car [] cars = {car1,car2,car3, car4};

      for (Car each:  cars){

          each.getCarInfo();
      }

        System.out.println( "==============================================");

        System.out.println("car1 = " + car1);


    }
}
