package day29_WrapperClass_ArrayList;

import java.util.ArrayList;

public class MaxNumArrayListMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(21);
        list.add(21323);
        list.add(212);
        list.add(223231);
        list.add(2133);

       int max =  maxNumFromArrayList(list);
       int min = minNumFromArrayList(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);


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
}
