package day28_DateTime;

import java.time.LocalDate;

public class WarmUp {

    public static void main(String[] args) {

        /*
    1. create an array of string, store five of your friends names in it
    2. create Array of localdates and store thier birthdays in the same order
    3. use for loop to print out your friends' names and thier birthdays
     */

        String [] friends = {"Muhtar","Akbar", "Gurhan"};

        LocalDate birthday1 = LocalDate.of(2020,2,12);
        LocalDate birthday2 = LocalDate.of(2010,12,12);
        LocalDate birthday3 = LocalDate.of(2000,1,12);

        LocalDate [] birthdays = {birthday1, birthday2, birthday3};


        for (int i = 0; i < friends.length; i++){

            System.out.println(friends[i]);
            System.out.println(birthdays[i]);
        }






    }
}
