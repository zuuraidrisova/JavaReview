package day52_Collection;

import java.util.*;

public class Sets {

    public static void main(String[] args) {

        //SET does not accept duplicates, does not have index numbers

        Set<String> names = new HashSet<>();
        // ==> polymorphism when parent is reference type for its child

        names.add("Zuura");//if there is duplicated object, it will only store one
        names.add("Zuura");
        names.add("Sary");
        names.add("Alina");

        System.out.println("names = " + names);

        System.out.println("===============================================");

        //HashSet : insertion order is not kept same
        //LinkedHashSet : insertion order is kept, as it is

        Set<String> names2 = new LinkedHashSet<>();
        // ==> polymorphism when parent is reference type for its child

        names2.add("Zuura");//if there is duplicated object, it will only store one
        names2.add("Zuura");
        names2.add("Sary");
        names2.add("Alina");

        System.out.println("names2 = " + names2);

        System.out.println("===============================================");

        String arr [] = {"Alina","Alina","Zuura","Sary"};

        System.out.println(Arrays.toString(arr));

        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        //the set will store the objects and remove duplicates, and keep insertion order

        System.out.println("set = " + set);

        // System.out.println(noDuplicates.get(1)); compile error, because no indexes

        System.out.println("========================================");

        //SortedSet(I) extends Set(I), and it is implemented by TreeSet(C), it is sorted,
        // TreeSet does not accept duplicates and sorts objects

        SortedSet<Integer> numbers = new TreeSet<>();

        numbers.addAll(Arrays.asList(2,8,0,1,3,6,5,4,7,8));
        //TreeSet will remove duplicates and at the same time sort the set

        System.out.println("numbers = " + numbers);

        //TreeSet is for removing duplicates and sorting the objects

        System.out.println("========================================");

 //TreeSet will sort insertion order, slower than hashSet bcs of iteration and sorting
  // HashSet has unpredictable order,and it accepts null, faster, bcs does not have to sort

        HashSet<String> hashSet = new HashSet<>();
        //hashSet allows null values

        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println("hashSet = " + hashSet);

        TreeSet<String> treeSet = new TreeSet<>();

        //this will throw NullPointerException, because treeSet doesn't allow null values
        treeSet.add(null);
        treeSet.add(null);
        treeSet.add(null);

        System.out.println("treeSet = " + treeSet);

        System.out.println("===================================");
    }
}
