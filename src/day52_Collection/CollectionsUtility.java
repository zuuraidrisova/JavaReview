package day52_Collection;

import java.util.*;

public class CollectionsUtility {

    public static void main(String[] args) {

    //if u want to sort any collection (list, set, queue), use Collections.sort() method

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,9,1,6,8,2,5,4,3,7,0));

        System.out.println("list = " + list);//prints list as it is

        Collections.sort(list);//sorts list in ascending order

        System.out.println("list = " + list);//prints sorted list now

        System.out.println("======================================");

        //remove duplicates from arrayList and print out in ascending order

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,3,2,1,4,6,5,7,7,9,9,8));

        System.out.println("list2 = " + list2);

        Set<Integer> noDuplicatesSorted = new TreeSet<>();

        noDuplicatesSorted.addAll(list2); //adding to treeSet
        //because list2 is already a collection type, we pass just list2

        System.out.println("noDuplicatesSorted = " + noDuplicatesSorted);

        list2 = new ArrayList<>(noDuplicatesSorted);
        //now we assign sorted and unique values back to list2

        System.out.println("list2 = " + list2);

        System.out.println("======================================");

        //remove duplicates from arrayList and print out in ascending order == easy way

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(100,2000,50,50,100, 200, 300, 50));

        System.out.println("list3 = " + list3);

        list3 = new ArrayList<>(new TreeSet<>(list3));
        //in constructor we pass collection type to sort and remove duplicates

        System.out.println("list3 = " + list3);

        System.out.println("======================================");

        //remove duplicates from arraylist without changing insertion order

        ArrayList<Integer> list4 = new ArrayList<>();

        list4.addAll(Arrays.asList(6,6,6,6,5,5,5,4,4,4,4));

        System.out.println("list4 = " + list4);

        list4 = new ArrayList<>(new LinkedHashSet<>(list4));

        System.out.println("list4 = " + list4);

        System.out.println("====================================");

        ArrayList<String> letters = new ArrayList<>();

        letters.addAll(Arrays.asList("A","A","B","C","B","D"));

        System.out.println("letters = " + letters);

        boolean unique = Collections.frequency(letters,"A") == 1;

        System.out.println("unique = " + unique);//it should be false, because A occured twice


    }
}
