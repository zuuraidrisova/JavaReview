package day24_CustomMethodsContinue;

import Resources.Library;

import java.util.Arrays;

public class ReturnMethod {

    public static void main(String[] args) {

        /*

        Any method can call any other method

        Return Type:  Void and Any other data type

        use  RETURN keyword to return data from a method

        if it is void it means that method cannot return any value
         */
        int maxNum = maxNum(23, 543, 65);

        System.out.println("maxNum = " + maxNum);

        System.out.println(maxNum(23, 43, 555));

        String reverve = reverseString("cybertek");

        System.out.println("reverve = " + reverve);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int minNum = minNum(array);

        System.out.println("minNum = " + minNum);

        int[] arr = {10, 30, 20, 40, 50, 80, 90, 70, 100};

        int descending [] =descendingArray(arr);

        System.out.println(Arrays.toString(descending));

        Library.palindrome("level");
        //we call a method using class name because it is static method, meaning belongs to class

       int [] merged =  Library.mergeTwoArrays(array, arr);

        System.out.println(Arrays.toString(merged));


        String str = "zuuuuuuraaa";

       String frequency =  Library.frequencyOfChars(str);

        System.out.println("frequency = " + frequency);

       String noDup =  Library.removeDuplicates(str);

        System.out.println("noDup = " + noDup);

        String uniques = Library.uniques(str);

        System.out.println("uniques = " + uniques);
    }


    public static int maxNum(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {

            return num1;

        } else if (num2 > num1 && num2 > num3) {

            return num2;

        } else {

            return num3;
        }
    }


    public static String reverseString(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static int minNum(int array[]) {

        Arrays.toString(array);

        return array[0];
    }

    public static int[] descendingArray(int [] array){

        int descArray [] = new int[array.length];

        int k = 0;

        for (int i = array.length-1; i >= 0; i--){

            descArray[k] = array[i];

            k++;
        }

        return descArray;
    }


}
