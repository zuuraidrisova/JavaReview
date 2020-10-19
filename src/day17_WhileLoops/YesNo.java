package day17_WhileLoops;

import java.util.Scanner;

public class YesNo {

    public static void main(String[] args) {

        /*
        ask the user to enter yes or no
        if the user enters other than yes or no
        repeat the question
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you like Java?");
        String answer = scan.next();

        while(! answer.equalsIgnoreCase("Yes") ||
                ! answer.equalsIgnoreCase("no")){

                System.out.println("Please enter yer or no: ");
                answer = scan.next();

                if(answer.equalsIgnoreCase("Yes") ||
                        answer.equalsIgnoreCase("no")){

                    break;
            }

        }


        if(answer.equalsIgnoreCase("Yes")){

            System.out.println("I am glad!");

        }
        if(answer.equalsIgnoreCase("No")){

            System.out.println("Too bad!");

        }


    }
}
