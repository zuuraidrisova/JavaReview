package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatesFormatting {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        System.out.println("now = " + now);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("04/10/2020");

        System.out.println("now = " + now.format(dtf));

        /*
        yy ==> two digits of year
        yyyy ==> full digits of year

        MM ==> numbers of month
        MMM ==> first three letters of month
        MMMM ==> full name of month

        dd ==> two digits of date

        EEE ==> first three letters of days of week
        EEEE ==> full name of days of week
         */

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");

        System.out.println("now = " + now.format(dtf2));

    }
}
