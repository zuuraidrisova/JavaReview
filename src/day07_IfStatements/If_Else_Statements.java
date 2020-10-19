package day07_IfStatements;

public class If_Else_Statements {

    public static void main(String[] args) {

        /*
        Single If Statements:

            if(condition is true){

                     code is executed;
            }

       If Else Statements:  only if condition is not true, else means otherwise

            if(condition is true){

                    code1 is executed;

            } else { //if condition 1 is not true

                    code2 is executed;
            }

         */

        //if a number is positive or negative

        int num = -10;

        if(num >= 0){

            System.out.println("Positive");
        }else{

            System.out.println("Negative");
        }

        // if a number is odd or even

        int number = 89;

        if( number % 2 == 0){

            System.out.println("Even");
        }else{

            System.out.println("Odd");
        }

        //if  a person can buy alcohol

        int age = 19;

        if(age >= 21){

            System.out.println("You can buy alcohol");
        }else{

            System.out.println("You cannot buy alcohol");
        }


        // if tested positive corona or not

        boolean coronaPositive = false;

        if(coronaPositive){

            System.out.println("Stay home, and buy more toilet paper!");

        }else{

            System.out.println("Do more coding! Java is a vaccine!");
        }
    }
}
