package day38_ConstructorChainRules;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {

    /*
    Custom class is a template, so it is better to create another class for using this class
    create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields

     */

    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity){

        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    //instance methods should be created, because we are gonna use instance variables
    /*
    	instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and
				total cost info as calculated by calcCost()
     */

    public double calcCost(){

        return quantity * unitPrice;
    }


    public String toString(){

        return "Item: "+name+", Unit price: $"+unitPrice+", Quantity: "+quantity+
                "\nTotal Cost of Item: $"+calcCost();

    }


}
  /*
    create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
     */
class ShoppingList{

      public static void main(String[] args) {

          Item item1 = new Item("apples",3.4,3);
          Item item2 = new Item("toilet paper", 25,2);
          Item item3 = new Item("tomato",1.4,5 );
          Item item4 = new Item("potato",6,3);
          Item item5 = new Item("coffee",5,1);

          ArrayList<Item> list = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));

          double totalCost = 0;

          for (Item each :  list){

              System.out.println(each);
              totalCost +=  each.calcCost();
          }

          System.out.println("totalCost = " + totalCost);


      }
  }