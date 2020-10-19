package day27_DateTime;

import java.time.LocalDate;

public class LocalDateFormatter {

    public static void main(String[] args) {

        //Local Date is an interface which helps us to set year, month and date

        LocalDate date = LocalDate.of(2020,10,4);

        System.out.println("date = " + date);

        LocalDate date2 = LocalDate.now();

        System.out.println("date2 = " + date2);

        boolean result = date.isLeapYear();

        System.out.println("result = " + result);

       boolean result2 =  date2.isAfter(date);

        System.out.println("result2 = " + result2);
    }
}
