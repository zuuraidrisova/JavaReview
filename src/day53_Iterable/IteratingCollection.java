package day53_Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratingCollection {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6));

        for (int i = 0; i < list.size(); i++){

            if (list.get(i) < 4){

                list.remove(i); //does not allow u remove all number under 4
            }
        }

        System.out.println("list = " + list);

        System.out.println("========================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6));

        list2.removeIf(p -> p < 4); //now it will remove all that matches the condition
        //removeIf uses iterator interface internally

        System.out.println("list2 = " + list2);

        System.out.println("========================================");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6));

        Iterator<Integer> iteratedList = list3.iterator();

        System.out.println("iteratedList.hasNext() = " + iteratedList.hasNext());
        System.out.println("iteratedList.next() = " + iteratedList.next());

        System.out.println("========================================");

        while(iteratedList.hasNext()){// will be true, because elements in list3
          //it will iterate until last element in the list, return true

           int number =  iteratedList.next();
           //next() method will get the object if condition is true

            if(number < 4){

                continue;
            }
            System.out.println("number = " + number);
        }

        System.out.println("========================================");

        ArrayList<Integer> list4 = new ArrayList<>();//nothing in list4

       Iterator<Integer> it =  list4.iterator();

       while(it.hasNext()){// will always be false, because nothing in list4
           //never will get executed

           System.out.println("it.next() = " + it.next());
       }

        System.out.println("list4 = " + list4);

        System.out.println("========================================");

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6));

        for (Iterator<Integer> i = list5.iterator(); i.hasNext(); ){
            //we dont have to make the condition false,
            // loop will stop when no elements left to iterate

            int number = i.next();

            if(number < 4){

                i.remove();
            }
        }


        System.out.println(list5);



    }
}
