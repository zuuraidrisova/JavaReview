package day18_DoWhileLoop;

import java.util.Scanner;

public class RoomReservation {
      /*
        write a program for the room reservation:
        king bed==?120$;
        queen bed ==> 100$;
        single bed ==> 80$;

        should ask which room do u want to reserve?

        if user provides invalid entry, please re-enter?!
        calculate the total price and display it

        do u want to reserve another room?
        if yes ==> repeat previous steps
        if no ==> your total price is +$$$

        if answer is either yes or no ==>please re-enter
         */
      public static void main(String[] args) {


          Scanner scan = new Scanner(System.in);

          int price = 0;

          while(true) {

              System.out.println("Welcome to International Hotel!");
              System.out.println("Which room would you like to book: king, queen or single?");
              String answer = scan.next();

              while(!(answer.equalsIgnoreCase("king") ||
                      answer.equalsIgnoreCase("queen")
                      || answer.equalsIgnoreCase("single"))) {

                  System.out.println("Please choose among our options: king , queen or single?");
                  answer = scan.next();

              }

              if(answer.equals("king")){

                  price += 120;

              }else if(answer.equals("queen")){

                  price += 100;

              }else if(answer.equals("single")){

                  price += 80;

              }

              System.out.println("Your room total is: "+price+" $");

              System.out.println("Do you want to book another room? ");
              String reply = scan.next();

              while (!(reply.equalsIgnoreCase("yes")
                      || reply.equalsIgnoreCase("no"))){

                  System.out.println("Please answer with yes or no? ");
                  reply = scan.next();

              }


              if(reply.equalsIgnoreCase("Yes")){
                  System.out.println("Which room would you like to book: king, queen or single?");
                  answer = scan.next();

              }

              if(reply.equalsIgnoreCase("NO")){
                  System.out.println("Thank you for staying with us!");
                  System.out.println("Your total price is: "+price+" $");
                  break;
              }


          }


      }





}
