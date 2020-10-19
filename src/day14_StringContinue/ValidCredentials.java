package day14_StringContinue;

import java.util.Scanner;

public class ValidCredentials {

    public static void main(String[] args) {

        /*
        valid credentials are :
        username:cybertek
        password:cybertekschool

        precondition: username and password cannot be empty, if they are empty
                      output should be: Please enter your credentials

        if user entered both valid username and password ==>log in
        if valid password, invalid username ==> username is incorrect
        if valid username, invalid password ==> password is incorrect
        if both password and username invalid ==> invalid username and password
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your username");

        String username = scan.nextLine();

        System.out.println("Please enter your password");

        String password = scan.nextLine();


        if(! username.isEmpty() || ! password.isEmpty()){

            if(username.equalsIgnoreCase("zuuraidrisova")
                    && password.equals("zuura90")){

                System.out.println("logged in!");

            }else if (username.equalsIgnoreCase("zuuraidrisova")
            && ! password.equals("zuura90")){

                System.out.println("Correct username, Incorrect password");

            }else if(! username.equalsIgnoreCase("zuuraidrisova")
            && password.equals("zuura90")){

                System.out.println("Incorrect username, correct password");

            }else{

                System.out.println("Both username and password are not correct");
            }

        }else{

            System.out.println("Please enter your username or password!");
        }

    }
}
