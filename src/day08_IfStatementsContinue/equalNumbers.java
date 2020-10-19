package day08_IfStatementsContinue;

public class equalNumbers {

    public static void main(String[] args) {

        //check equality of 3 numbers

        int num1 = 32;
        int num2 = 34;
        int num3 = 32;

        boolean num1EqualNum2 = num1 == num2 && num2 != num3;
        boolean num1EqualNum3 =  num1 == num3 && num1 != num2;
        boolean num2EqualNum3 =  num2 == num3 && num2 != num1;
        boolean allEqual = num1 == num2 && num2 == num3;
        boolean nonEqual = num1 != num2 && num1 != num3 && num2 != num3;

       // boolean nonEqual = !num1EqualNum2 && !num1EqualNum3 && !num2EqualNum3;

        if(num1EqualNum2){

            System.out.println(num1 + " is equal to "+num2);

        }else if( num1EqualNum3){

            System.out.println(num1 + " is equal to "+ num3);

        }else if(num2EqualNum3){

            System.out.println(num2 + " is equal to "+num3);

        }else if(allEqual){

            System.out.println("All numbers are equal");

        }else{

            System.out.println("None of the numbers are equal");
        }



    }
}
