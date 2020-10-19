package day12_JavaRecap;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of building: ");

        int buildingNo = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the street: ");

        String street = scanner.nextLine();

        System.out.println("Enter your city: ");

        String city = scanner.nextLine();

        System.out.println("Enter your state: ");

        String state = scanner.next();

        System.out.println("Enter your zipcode: ");

        String zipCode = scanner.next();

        String fullAddress = buildingNo+", "+ street+", "+city+", "+state+", "+zipCode;

        System.out.println("fullAddress:  " + fullAddress);

        scanner.close(); //now scanner is not available any more, because we closed it
        //if we want to use scanner again, we have to create an object of Scanner class again

    }
}
