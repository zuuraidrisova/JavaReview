package day07_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        //write a program that accepts 3 numbers and return the median of them

        int a = 1000;
        int b = 233;
        int c = 89;

        if(a < b && a > c || a > b && a < c ){

            System.out.println(a + "is a median number");

        }else if( b > a && b < c || b < a && b > c){

            System.out.println(b+ " is a median number");
        }else{

            System.out.println(c+ " is median number");
        }


    }
}
