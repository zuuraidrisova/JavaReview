package Resources;

import java.util.ArrayList;

public class Library {

    public static String reverseString(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);
        }

        return reversed;
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

    public static int maxNumFromArrayList(ArrayList<Integer> list){

        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++){

            if(maxNum < list.get(i)){

                maxNum = list.get(i);

            }
        }

        return maxNum;

    }

    public static int minNumFromArrayList(ArrayList<Integer> list){

        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++){

            if(minNum > list.get(i)){

                minNum= list.get(i);

            }
        }

        return minNum;

    }

    //merge two array

    public static int [] mergeTwoArrays(int[] array1, int  [] array2){

        int [] merged = new int[array1.length + array2.length];

        for (int i = 0; i  < array1.length; i++){

            merged[i] = array1[i];

        }

        for (int j = 0 ; j < array2.length; j++){

            merged[array1.length + j] = array2[j];
        }

        return merged;
    }


    public static String frequencyOfChars(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++){

            int count = 0;

            for (int j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    count++;

                }
            }

            if(!result.contains(""+ str.charAt(i))){

                result += str.charAt(i)+""+count;
            }
        }

        return result;

    }

    public static String removeDuplicates(String str){

        String noDup = "";

        for (int i = 0; i < str.length(); i++){

            if(!noDup.contains(""+ str.charAt(i))){

                noDup += str.charAt(i);
            }
        }

        return noDup;
    }

    public static String uniques(String str){

        String uniques = "";

        for (int i = 0; i < str.length(); i++){

            int count = 0;

            for (int j = 0; j < str.length(); j++){

                if (str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }

            if(count == 1){

                uniques += str.charAt(i);
            }
        }

        return uniques;

    }

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list){

        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = list.size()-1; i >= 0; i--){

            reversed.add(list.get(i));
        }

        return reversed;
    }


    public static ArrayList<Integer> uniquesFromArrayList(ArrayList<Integer> list){

        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            int count = 0;

            for (int j = 0; j < list.size(); j++){

                if(list.get(i) == list.get(j)){

                    count++;
                }
            }

            if(count == 1){

                uniques.add(list.get(i));
            }
        }


        return  uniques;


    }

    public static ArrayList<String> combineTwoArraysIntoArrayList(String [] arr1, String [] arr2){

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++){

            list.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++){

            list.add(arr2[i]);
        }

        return  list;
    }

    public static ArrayList<String> uniquesFromArrayListOfStrings(ArrayList<String> list){

        ArrayList<String> uniques = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            int count = 0;

            for (int j = 0; j < list.size(); j++){

                if(list.get(i).equals(list.get(j))){

                    count++;
                }
            }

            if (count == 1){

                uniques.add(list.get(i));

            }
        }

        return  uniques;

    }

    public static ArrayList<Integer> removeDuplicatesFRomArrayList(ArrayList<Integer> list){

        ArrayList<Integer> noDuplicates = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            if(!noDuplicates.contains(list.get(i))){

                noDuplicates.add(list.get(i));
            }
        }

        return  noDuplicates;
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
