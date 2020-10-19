package day21_MultiDimensional;

import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {

        String [] wildAnimals = {"Tiger","Lion","Turtles","Monkey"};

        String [] birds = {"Eagle","Ducks","Peacock","Dove"};

        String [] [] zoo = {wildAnimals, birds};

        System.out.println(Arrays.deepToString(zoo));

        for (String each : zoo[1]){

            System.out.println(each);
        }


        System.out.println("======================================");


        for (String each : zoo[0]){

            if(each.equalsIgnoreCase("lion")){
                continue;
            }

            System.out.println("each = " + each);
        }









    }
}
