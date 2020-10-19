package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {

    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.setCatInfo("Marko","British","gray",3);

        Cat cat2 = new Cat();

        cat2.setCatInfo("Suzie", "Sisame", "white",5);

        System.out.println("cat1 = " + cat1);
        System.out.println("cat2 = " + cat2);

        System.out.println("==================================");

        Cat cat3 = new Cat();

        cat3.setCatInfo("Galya", "Calico","black",1);

        ArrayList<Cat> catsList = new ArrayList<>(Arrays.asList(cat1,cat2,cat3));

        for (int i = 0; i < catsList.size(); i++){

            System.out.println(catsList.get(i));
        }

        System.out.println("==================================");

        for (Cat each :catsList){

            System.out.println(each);
        }

        System.out.println("==================================");

        for (Cat each :  catsList){

            each.drink("milk");
            each.eat("Whiskas");
            each.sleep(8);
        }


    }
}
