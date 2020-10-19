package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        /*
        username: zuuraidrisova
        password: zuura90
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scan.next();
        System.out.println("Enter password: ");
        String password = scan.next();

        boolean valid = username.equalsIgnoreCase("zuuraidrisova") && password.equals("zuura90");

        int count = 1;

        while(! valid){

            System.out.println("Re-enter credentials: ");
            System.out.println("Enter username: ");
            username = scan.next();
            System.out.println("Enter password: ");
            password = scan.next();


            valid = username.equalsIgnoreCase("zuuraidrisova") && password.equals("zuura90");

            count++;

            if(count == 3 && !valid){

                System.out.println("Your account is locked!");
                break;

            }
        }

        if(valid){

            System.out.println("Logged in!");
        }


    }

}
