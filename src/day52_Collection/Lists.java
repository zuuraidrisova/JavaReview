package day52_Collection;

import java.util.*;

public class Lists {

    //List has:  ArrayList, LinkedList, Vector (and Vector has Stack in it)

    // List: implemented by ArrayList, LinkedList, Vector

    /*

    How the ArrayList works
The ArrayList class has a regular array inside it. When an element is added,
it is placed into the array. If the array is not big enough, a new,
 larger array is created to replace the old one and the old one is removed.

    How the LinkedList works
The LinkedList stores its items in "containers." The list has a link to the first
container and each container has a link to the next container in the list.
To add an element to the list, the element is placed into a new container and
that container is linked to one of the other containers in the list.

     */


    public static void main(String[] args) {

        //List<Integer> list0 = new List<Integer>(); will create a compile error
        //because list is an interface, we cannot create an object from interface
        //List can only act as reference type

        List<Integer> list1 = new ArrayList<>();
        // ==> polymorphism when parent is reference type for its child

        list1.add(1); //=> add() method is overridden method comes from ArrayList

        // ArrayList is a singly linked list, internally uses array
        // it is much faster in retrieving data
        int a = list1.get(0);

        System.out.println(a);

        System.out.println("=========================");

        List<Integer> list2 = new LinkedList<>();
        // ==> polymorphism when parent is reference type for its child

        //LinkedList is faster when we add or remove data because it is doubly linked list
        // internally works in sequences
        //LinkedList consists of nodes/values that are related to each other

        list2.add(12);

        System.out.println("list2 = " + list2);

        System.out.println("=========================");

        //ArrayList and Vector both use array internally,
        // the difference is vector is synchronized, vector methods have synchronized keyword

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12); //this add() regular

        Vector<Integer> vector = new Vector<>();

        vector.add(22);//this add() is synchronized

        //SYNCHRONIZED  is used to achieve thread-safety
        //Thread ==> is process of operating system for scheduling objects, one at a time
        //thread makes program slower since one by one

        Stack<Integer> stack = new Stack<>();//class extends vector

        stack.add(23);//this add() is synchronized

   //the difference between vector and stack is that stack is LAST IN FIRST OUT order

        System.out.println("=========================");

        Stack<String> names = new Stack<>();

        names.add("Zuura");
        names.add("Sary");
        names.add("Zeynep");

        System.out.println("names = " + names);

        String last = names.pop();
        //pop() synchronized method, which removes last inserted object
        //last in was Zeynep, she will be first out ==>removed

        System.out.println("last = " + last);

        names.push("Phu");//push() is used to insert

        System.out.println("names = " + names);

    }




}

