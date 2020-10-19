package day08_IfStatementsContinue;

public class Multi_Branch_IfStatements {

    public static void main(String[] args) {
        /*
        if (condition1) {

            // block of code to be executed if condition1 is true

        } else if (condition2) {

             // block of code to be executed if the condition1 is false and condition2 is true

        } else {

            // block of code to be executed if the condition1 is false and condition2 is false
        }
         */

        //if a number is positive, negative or zero

        int num = -1;

        if(num > 0){

            System.out.println("Positive");

        }else if(num < 0){

            System.out.println("Negative");
        }else{

            System.out.println("Zero");
        }

    }
}
