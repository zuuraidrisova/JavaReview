package day30_ArrayList;

public class SumOfDigitsFromString {
    /*
        1. write a program that can return the sum of all the digits from a string
        ex:
        input: "a1b2c3"
        output: 6
        (1+2+3= 6)

        input: "Today's date is 04/27/2020"
        output: 17
        (0+4+2+7+2+0+2+0=17)

        HINT: on ascii table, the characters between #48 ~ #57 are digits

 */
    public static void main(String[] args) {

        String str = "a1b2c3";

       char ch [] =  str.toCharArray();

       int sumOfDigits = 0;

       for (int i = 0; i < ch.length; i++){

           if(Character.isDigit(ch[i])) {

               int num = Integer.parseInt(""+ch[i]);

               sumOfDigits += num;

           }
       }

        System.out.println("sumOfDigits = " + sumOfDigits);

       int sum = sumOgDigits(str);

        System.out.println("sum = " + sum);

    }

    public static int sumOgDigits(String str){

       char ch [] =  str.toCharArray();

       int sumOfDigits = 0;

       for (int i = 0; i < ch.length; i++){

           if(Character.isDigit(ch[i])){

              sumOfDigits += Integer.parseInt(""+ch[i]);
           }

       }

       return sumOfDigits;
    }




}
