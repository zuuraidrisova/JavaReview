package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        /*
        Queue is child interface of Collection too
              size is dynamic, accepts duplicates, but does not have index numbers

        PriorityQueue is a class that implements Queue interface

           poll()==>  FIRST IN FIRST OUT order
         */

        Queue<String> names = new PriorityQueue<>();
        // ==> polymorphism when parent is reference type for its child

        names.add("Zuura");
        names.add("Sary");
        names.add("Alina");
        names.add("Meerim");

        System.out.println("names = " + names);

       String first = names.poll();//returns first object and removes it at the same time

        System.out.println("first = " + first);

        System.out.println("names = " + names);

        /*
        PriorityQueue is storing with natural order ==alphabetical,
        so that is why Alina i showing up first,and removed when we poll it
        */


    }
}
