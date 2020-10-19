package day52_Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SameLetters {

    public static void main(String[] args) {

        //write a program that can identify if two strings are built out of same letters

        String str = "hello";
        String str1 = "olleh";

        boolean result = sameLetters(str,str1);

        System.out.println("result = " + result);

        boolean result2 = sameLetters2(str,str1);

        System.out.println("result2 = " + result2);

        boolean result3 = sameLetter3(str,str1);

        System.out.println("result3 = " + result3);


    }

    //short way
    public static boolean sameLetters(String str1, String str2){

        str1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        return str1.equals(str2);

    }

    //using array
    public static boolean sameLetters2(String str, String str1){

        String [] array = str.split("");
        String [] array1 = str1.split("");

        Set<String> t1 = new TreeSet<>(Arrays.asList(array));
        Set<String> t2 = new TreeSet<>(Arrays.asList(array1));

        str = t1.toString();
        str1 = t2.toString();

        boolean same = str.equals(str1);

        return same;

    }

    //using for loop
    public static boolean sameLetter3(String str1, String str2){

      Set<String> t1 =  new TreeSet<>(Arrays.asList(str1.split("")));
      Set<String> t2 =  new TreeSet<>(Arrays.asList(str2.split("")));

      String a = "";

      for (String each :  t1){

          a += each;
      }

      String b = "";

      for (String each :  t2){

            b += each;
     }

      return a.equals(b);

    }






}
