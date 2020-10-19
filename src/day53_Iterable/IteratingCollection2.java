package day53_Iterable;

import java.util.*;

public class IteratingCollection2 {

    public static void main(String[] args) {


        LinkedHashSet<String> names = new LinkedHashSet<>();//removes duplicates

        names.addAll(Arrays.asList("Asan","Asan","Sary", "Sary","Shamil","Ozgur","Osman","Mehmet"));

        System.out.println("names = " + names);

        Iterator<String> it =  names.iterator(); //to apply iterator

        while(it.hasNext()){//iterates until last element in set

           if(it.next().toLowerCase().contains("m")){//condition to eliminate names containing m

               it.remove();//will remove if condition is true
           }
        }

        System.out.println("names = " + names);

        System.out.println("===================================");

        LinkedHashSet<String> names2= new LinkedHashSet<>();//removes duplicates

        names2.addAll(Arrays.asList("Asan","Asan","Sary", "Sary","Shamil","Ozgur","Osman","Mehmet"));

        System.out.println("names2 = " + names2);

       for( Iterator<String> it2 =  names2.iterator(); it2.hasNext();){

           if(it2.next().toLowerCase().contains("m")){

               it2.remove();
           }
       }

        System.out.println("names2 = " + names2);

        System.out.println("===========================================");

        //to remove names containing m or M using removeIf
        LinkedHashSet<String> names3= new LinkedHashSet<>();//removes duplicates

        names3.addAll(Arrays.asList("Asan","Asan","Sary", "Sary","Shamil","Ozgur","Osman","Mehmet"));

        System.out.println("names3 = " + names3);

        names3.removeIf(p -> p.toLowerCase().contains("m"));
        //removeIf does the same thing, because this method uses iterator internally

        System.out.println("names3 = " + names3);

        System.out.println("===================================");

        //to remove names which match Mehmet using removeAll
        LinkedHashSet<String> names4= new LinkedHashSet<>();//removes duplicates

        names4.addAll(Arrays.asList("Asan","Asan","Sary", "Sary","Shamil","Ozgur","Osman","Mehmet"));

        System.out.println("names4 = " + names4);

        names4.removeAll(Arrays.asList("Mehmet"));

        System.out.println("names4 = " + names4);

        System.out.println("===================================");

        //to keep names  Sary and Asan using retainAll
        LinkedHashSet<String> names5= new LinkedHashSet<>();//removes duplicates

        names5.addAll(Arrays.asList("Asan","Asan","Sary", "Sary","Shamil","Ozgur","Osman","Mehmet"));

        System.out.println("names5 = " + names5);

        names5.retainAll(Arrays.asList("Asan","Sary"));//keep just these names, remove others

        System.out.println("names5 = " + names5);

        System.out.println("===================================");

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

        boolean result  = list.containsAll(Arrays.asList(5,6,9,8));

        System.out.println("result = " + result);



    }
}
