package day30_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

       // add(index, object) ==>  adds the object at the given index

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);//0
        list.add(4);//1
        list.add(2);//2

        System.out.println("list = " + list);

        list.add(1, 6);//list = [3, 4, 2]

        System.out.println("list = " + list);//list = [3, 6, 4, 2]

        //set(index, object) ==>  changes the specific object at given index

        list.set(3,5);

        System.out.println("list = " + list);//list = [3, 6, 4, 5]


        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add(1,"C");
        list2.add(1,"D");

        System.out.println("list2 = " + list2);//list2 = [A, D, C, B]

        list2.set(3,"F");//replaces object at index 3 with a new one 'F'

        System.out.println("list2 = " + list2);//list2 = [A, D, C, F]

        //remove(index) ==> removes object at given index

        //remove(object) ==> removes specified object

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        System.out.println("list3 = " + list3);//list3 = [1, 2, 3, 4]

        int a = 1;
        list3.remove(a); //a is an index number, which will be removed

        System.out.println("list3 = " + list3);//list3 = [1, 3, 4]

        Integer b = 4;
        boolean bool = list3.remove(b);// b is an object which will be removed
        //if you pass an object to remove then it can return a boolean expression

        System.out.println("list3 = " + list3);//list3 = [1, 3]
        System.out.println("bool = " + bool); //true because object is removed

        //clear() ==> removes everything from list, and the size of list becomes 0

        list3.clear();

        System.out.println("list3 = " + list3); //list3 = []

        //indexOf(object) ==> returns index number of an object, takes only object

        ArrayList<Integer> list4 = new ArrayList<>();

        list4.add(23);
        list4.add(233);
        list4.add(23322);
        list4.add(23323);

        System.out.println("list4 = " + list4);

        int index =  list4.indexOf(233);

        System.out.println("index = " + index);


    }
}
