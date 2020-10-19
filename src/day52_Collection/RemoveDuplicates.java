package day52_Collection;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "zuuuuuuuuuuuraa";

        String array [] = str.split("");

        LinkedHashSet<String> noDup = new LinkedHashSet<>(Arrays.asList(array));

        System.out.println("noDup = " + noDup);

        String noDuplicates = "";

        for (String each : noDup){

            noDuplicates += each;

        }

        System.out.println("noDuplicates = " + noDuplicates);

        System.out.println("============================");


        String result =  removeDuplicates(str);

        System.out.println("result = " + result);

        System.out.println("============================");

        String result2 = removeDuplicates2(str);

        System.out.println("result2 = " + result2);

        System.out.println("============================");

        String result3 = removeDuplicates3(str);

        System.out.println("result3 = " + result3);
    }

    public static String removeDuplicates(String str){

        String array [] = str.split("");

        Set<String> set = new LinkedHashSet<>(Arrays.asList(array));

        String result = "";

        for (String each :  set){

            result += each;
        }


        return result;
    }



    public static String removeDuplicates2(String str){

        String noDuplicates = "";


        for (int i = 0; i < str.length(); i++){

            if(!noDuplicates.contains( ""+str.charAt(i))){

                noDuplicates += str.charAt(i);
            }
        }

        return noDuplicates;
    }

    public static String removeDuplicates3(String str){

        Set<String> set = new LinkedHashSet<>(new ArrayList<>(Arrays.asList(str.split(""))));

        String result = "";

        for (String each : set){

            result += each;
        }

        return result;
    }
}
