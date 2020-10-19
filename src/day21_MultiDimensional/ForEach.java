package day21_MultiDimensional;

public class ForEach {

    public static void main(String[] args) {

        //for each loop is already iterated loop, it always loops till the last element
        //use for each loop when u dont need indexes

        int a [] = {1,2,3,4};

        for (int each: a) {

            if(each == 2){

                continue;
            }
            System.out.println(each);
        }

        String [] str = { "Kubanychbek","Asan", "Zuura","Alina","Zeynep"};

        for (String each : str){

            if(each.equalsIgnoreCase("asan")){

                continue;
            }
            System.out.println("each = " + each);
        }
    }
}
