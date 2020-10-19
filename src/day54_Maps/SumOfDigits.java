package day54_Maps;

public class SumOfDigits {

    public static void main(String[] args) {

        //Write a method that can return the sum of the digits in a string

        String str = "a1b2c3";

        int sum = sumOfDigits(str);

        System.out.println("sum = " + sum);
    }

    public static int sumOfDigits(String str){

       char [] ch = str.toCharArray();

       int sum = 0;

       for (int i = 0; i < ch.length; i++){

           if(Character.isDigit(ch[i])) {//we have to check if the character is digit first before converting it to an integer

               int number = Integer.parseInt("" + ch[i]);

               sum += number;
           }
       }

       return sum;
    }


}

