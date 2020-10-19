package day08_IfStatementsContinue;

public class NestedIf {

    public static void main(String[] args) {
        /*
   Nested if: if condition can be evaluated to multiple scenarios and we have pre-condition
         */
        //check if u can vote
        boolean citizen = true;
        int age = 18;

        if(citizen == true){

            if(age >= 18){

                System.out.println("You are eligible to vote!");
            }else{

                System.out.println("You are not old enough to vote!");
            }

        }else{

            System.out.println("You must be a US citizen!");
        }


        //check if u r eligible to get a loan

        int salary = 30000;
        int yearOnJob = 2;

        if(salary >= 30000){

            if(yearOnJob >= 3){

                System.out.println("You are eligible to get a loan!");

            }else{

                System.out.println("You do not have enough work experience!");
            }

        }else{

            System.out.println("You do not have enough salary range!");
        }




    }
}
