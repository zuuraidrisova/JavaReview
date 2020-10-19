package day05_PrimitiveCatings_UnaryOperators;

public class LeapYear {

    public static void main(String[] args) {

        short year =  2020;

        //leap year must be divisible by 4 without remainder

        boolean leapYear = year % 4 == 0;
         //returns true if it is a leap year
        //returns false it is not a leap year

        System.out.println("leapYear = " + leapYear);


    }
}
