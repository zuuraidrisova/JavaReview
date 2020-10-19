package day43_MethodOverriding;

public class PalindromeNumber {

    /*
    write a method to check if a number is PALINDROME or Not
This can also be done using remainder (%) operator.
//////////////////
     */

    public static void main(String[] args) {

        long number = 232323232;

        boolean result = palindrome(number);

        System.out.println("result = " + result);
    }
    public static boolean palindrome(long num){

        String number = Long.toString(num);

        String revNum = "";

        for (int i = number.length()-1; i >= 0; i--){

            revNum += number.charAt(i);
        }

        if(number.equals(revNum)){

            return true;
        }

        return false;
    }
}
