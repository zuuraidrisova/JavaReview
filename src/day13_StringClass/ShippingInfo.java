package day13_StringClass;

import java.util.Scanner;

public class ShippingInfo {

    public static void main(String[] args) {

         /*
     write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a building number: ");
        String buildingNumber = scan.next();

        scan.nextLine(); //ENTER

        System.out.println("Enter a street address: ");
        String streetAddress = scan.nextLine();

        System.out.println("Enter city: ");
        String city = scan.nextLine();

        System.out.println("Enter state: ");
        String state = scan.nextLine();

        System.out.println("Enter zipcode: ");
        int zipcode = scan.nextInt();

        scan.nextLine(); //ENTER

        System.out.println("Enter full name: ");
        String fullName = scan.nextLine();


        String report = "Ship To: \t\t"+fullName+"\n\t\t\t\t"+buildingNumber+" "+streetAddress
                +"\n\t\t\t\t"+city+", "+state+" "+zipcode;

        System.out.println(report);


    }


}
