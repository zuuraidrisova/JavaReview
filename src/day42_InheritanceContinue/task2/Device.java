package day42_InheritanceContinue.task2;

public class Device {

      /*
    create a class called device:
				attributes: brand, model, price, country, type
				methods: toString


				one class can extend only one class
				one class can be inherited by multiple subclasses
     */


    public String brand;
    public String model;
    public double price;
    public String country;
    public String type;
    public String size;

    public void setDeviceInfo(String brand, String model,double price, String country, String type, String size){

        this.brand = brand;
        this.model = model;
        this.price = price;
        this.country = country;
        this.type = type;
        this.size = size;

    }

    public String toString(){

        return "Brand: "+brand+", Model: "+model+", Price: "+price+
                ", Country: "+country+", Type: "+type+", Size: "+size;
    }




}
