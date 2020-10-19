package day24_CustomMethodsContinue;

import java.util.Arrays;

public class warmUpMethods {

    public static void main(String[] args) {

        maxNumber(23,45);

        calculation(23,12,"-");

        palindrome("level");

        int [] array = {1,2,3,4,5,6,7,8,9,10};

        int max = maxNumberFromArray(array);

        System.out.println("max = " + max);

        int min = minNumberFromArray(array);

        System.out.println("min = " + min);

        arrayDescending(array);
    }

    public static void maxNumber(int i, int j){

        if(i > j){

            System.out.println(i + " is greater");
        }else{

            System.out.println(j + " is greater");
        }
    }

    public static void calculation(int num1, int num2, String operator){

        if(operator.equals("+")){

            System.out.println(num1 + num2);

        }else if(operator.equals("-")){

            System.out.println(num1 - num2);

        }else if(operator.equals("*")){

            System.out.println(num1 * num2);

        }else if(operator.equals("/")){

            System.out.println(num1 / num2);

        }else if(operator.equals("%")){

            System.out.println(num1 % num2);
        }else{

            System.out.println("Invalid operand");
        }


    }

    public static void palindrome(String str){

        String result = "";

        for(int i = str.length()-1; i >= 0; i --){

            result += str.charAt(i);

        }

        if(str.equals(result)){

            System.out.println("palindrome");
        }else{

            System.out.println("not palindrome");
        }
    }

    public static int maxNumberFromArray(int [] array){

        int maxNumber = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){

            if(array[i] > maxNumber){

                maxNumber = array[i];
            }
        }

        return  maxNumber;

    }

    public static int minNumberFromArray(int [] array){

        int minNumber = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){

            if(array[i] < minNumber){

            minNumber = array[i];
            }
        }

        return  minNumber;

    }


    public static void arrayDescending(int [] array){

        int [] desc = new int[array.length];

        int k = 0;

        for(int j = array.length-1; j >= 0; j--){

            desc[k] = array[j];

            k++;
        }

        System.out.println(Arrays.toString(desc));
    }




}
