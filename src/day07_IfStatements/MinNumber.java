package day07_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        //write a program that accepts 3 numbers and return the min of them

        int a = 10;
        int b = 23;
        int c = 89;

        if(a < b && a < c){

            System.out.println(a + " is the min number");

        }else if( b < a && b < c){

            System.out.println(b +" is the min number");

        }else{

            System.out.println(c + " is the min number");
        }




    }
}
