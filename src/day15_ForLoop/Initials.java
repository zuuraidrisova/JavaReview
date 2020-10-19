package day15_ForLoop;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        /*
         write a program that asks user's first and last name,
         then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        String initials = firstName.substring(0,1) +lastName.substring(0,1);

        initials = initials.toUpperCase();

        System.out.println("initials = " + initials);

    }
}
