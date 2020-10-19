package day29_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayList_Intro {

    public static void main(String[] args) {

        /*

        ArrayList class is a part of Collection interface, located in java.util package
         we need to import the class in order to use it

         The ArrayList class is a resizable array, accepts only wrapper class objects

         DO NOT SUPPORT PRIMITIVES

         Syntax: ArrayList <String> names = new ArrayList();

          ~~ The difference between a built-in array and an ArrayList in Java :

          the size of an array cannot be modified, it is fixed!
          the size of ArrayList is dynamic, removing or adding can happen anytime

          array can accept primitives and wrapper class all
          ArrayList accepts only Wrapper Class

          The ArrayList class has many useful methods.

           add(value) method: To add elements to the ArrayList
           get(index) method: To access an element in the ArrayList
           set(index) method: To modify an element
           remove(index) method: To remove an element
           clear() method: To remove all the elements in the ArrayList
           size() method: To find out how many elements an ArrayList have

        ArrayList is also ordered data structure, it has index numbers,
                so it is easy to manipulate with arrayList
                index number starts from 0


       */

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(10); //now size is 1
        scores.add(20);//now size is 2
        scores.add(30);// now size is 3
        //every time u add element to Arraylist its size will adjust accordingly

        System.out.println("scores = " + scores);

       int score1 = scores.get(2);//2 is an index number,

        System.out.println("score1 = " + score1);


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(23);
        numbers.add(1223);
        numbers.add(2321);
        numbers.add(2123);
        numbers.add(222);

        System.out.println("numbers = " + numbers);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.size(); i++){

            if(max < numbers.get(i)){

                max = numbers.get(i);
            }
        }

        System.out.println("max = " + max);


        ArrayList<String> grocery = new ArrayList<>();

        grocery.add("eggs");
        grocery.add("salt");
        grocery.add("potatoes");

        System.out.println("grocery = " + grocery);

        for (String each: grocery){
            System.out.println(each);
        }

       int size =  grocery.size();

        System.out.println("size = " + size);



    }
}
