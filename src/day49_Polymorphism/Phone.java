package day49_Polymorphism;

interface Downloadable{
    /*
      1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
     */

    boolean downloadable = true;// by default public static and final

    public abstract void download();// be default method is public,  abstract


}

/*
    1. create an interface named AndroidApps that can inherit from downloadable
    interface
            variable: AppStoreName

 */

interface AndroidApps extends Downloadable{

    String appStoreName = "Android Store";// by default public static and final

}

/*
    2. create an interface named AppleApps that can inherit from downloadable
     interface
            variable: AppStoreName
 */

interface AppleApps extends Downloadable{

    String appStoreName = "Apple Store";// by default public static and final

}

/*
    3. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
            toString method
 */
public abstract class Phone {

    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber);
    //in abstract class abstract methods must have abstract keyword

    public abstract void calling(long phoneNumber);

    public String toString(){

        return "brand = " + brand + ", model = " + model + ", price = " + price + ", size = " + size;

    }

}

/*
    4. create a class named iPhone that can inherit from AppleApps interface
    and Phone abstract class actions that every iphone can do: texting(),
     calling(), faceTiming(), selfie()
 */

final class Iphone extends Phone implements  AppleApps{
    //we mark it final, it cannot be inherited

    static {

        brand = "Iphone";//brand is static so we use static block to initialize it
    }
    public Iphone(String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;

    }
    @Override
    public void download() {

        if(downloadable){

            System.out.println(brand+" can download files from "+appStoreName);
        }
    }

    @Override
    public void texting(long phoneNumber) {

        System.out.println(brand+" is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {

        System.out.println(brand+" is calling "+phoneNumber);
    }

    public void faceTiming(){

        System.out.println(brand+" is facetiming");
    }

    public void selfie(){

        System.out.println(brand+" is taking beautiful selfies");
    }
}

/*
   5. create a class named Nokia that can inherit from AndroidApps interface
            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
    in each sub classes of phone, create a constructor to initialize the instances
 */

final class Nokia extends Phone implements AndroidApps{


    static {

        brand = "Nokia";
    }
    public Nokia(String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;

    }
    @Override
    public void download() {

        if(downloadable){

            System.out.println(brand+" can download files from "+appStoreName);
        }
    }

    @Override
    public void texting(long phoneNumber) {

        System.out.println(brand+" is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {

        System.out.println(brand+" is calling "+phoneNumber);
    }

    public void freezing(){

        System.out.println(brand+" is freezing");
    }

    public void breakFloor(){

        System.out.println(brand+" can break the floor");
    }
}

class PhoneObjects{

    public static void main(String[] args) {

        Iphone iphone = new Iphone("XR",850, "medium");

        System.out.println("iphone = " + iphone);

        iphone.calling(8273618);
        iphone.texting(38261411);
        iphone.download();
        iphone.faceTiming();
        iphone.selfie();

        System.out.println("==================================================");

        Nokia nokia = new Nokia("Lumia", 69, "medium");

        System.out.println("nokia = " + nokia);

        nokia.calling(3287961);
        nokia.texting(3612341);
        nokia.download();
        nokia.breakFloor();
        nokia.freezing();
    }
}