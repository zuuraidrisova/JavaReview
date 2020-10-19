package day30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
    /*
    2. write a program that can print the list of integers in reversed order
        ex:
        list=> {1,2,3,4,5}
        output: 5 4 3 2 1

     */

    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println("list = " + list);

        for(int i = list.size()-1; i >= 0; i--){

            System.out.print(list.get(i)+" ");
        }

        System.out.println();


       ArrayList<Integer> reversed =  reverseArrayList(list);

        System.out.println("reversed = " + reversed);
    }

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list){

        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = list.size()-1; i >= 0; i--){

            reversed.add(list.get(i));
        }

        return reversed;
    }




}
