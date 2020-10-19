package day52_Collection;

import java.util.ArrayList;

public class NullKeyword {

    static String str; //if u do not instantiate it, the default value is null,
    // we dont have object yet

    static String str2 = "Cybertek";//now we have object

    static ArrayList<Integer> list1; //we haven't instantiated the object yet

    public static void main(String[] args) {
        /*

        null keyword is a default value of all reference type

         */

        System.out.println(str2.charAt(0));


        // System.out.println(str.charAt(0));
        //this will throw NullPointerException, because str is referring to null

        String str3 = null;//all reference type we can assign null
        Integer i = null;//all reference type we can assign null


        list1 = new ArrayList<>();

        list1.add(null);//we can insert null into list

        System.out.println("list1 = " + list1);

        System.out.println("===================================");

        String number = "123";

        System.out.println("this nymber is string= " + number);

        int num = Integer.parseInt(number);

        System.out.println("num = " + num);

        System.out.println("===================================");

        String [] array = {null, "Cybertek", null};

        System.out.println(array.length);//size is 3, because reserves a spot

        String name = array[1].toUpperCase();//we can retrieve index 1 because it is an object

        array[0].toUpperCase();//this is referring to null, so no object there

        System.out.println("name = " + name);


    }
}
