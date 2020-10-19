package day54_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public enum Color {

    //these all are enums which mean they are all public, static and final ath the same time
    //enums are constants
    Red, Yellow, Green, Blue, Purple, White, Black;


}

class testColor{

    public static void main(String[] args) {

        Color myFavouriteColor = Color.Green; //it is enum ==> constant

        System.out.println("myFavouriteColor = " + myFavouriteColor);

        Color myFavouriteColor2 = Color.Purple; //it is enum ==> constant

        System.out.println("myFavouriteColor2 = " + myFavouriteColor2);

        Color myFavouriteColor3 = Color.Red; //it is enum ==> constant

        System.out.println("myFavouriteColor3 = " + myFavouriteColor3);

        System.out.println("========================================");

        ArrayList<Enum> colors = new ArrayList<>();

        colors.addAll(Arrays.asList(myFavouriteColor,myFavouriteColor2,myFavouriteColor3));

        System.out.println("colors = " + colors);

        System.out.println("========================================");

        for (Enum each: colors){

            System.out.println(each);
        }
    }
}