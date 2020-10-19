package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(16,30);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");

        /*
        hours :  hh
        minutes: mm
        seconds : ss
        a/p
         */

        System.out.println("time = " + time);
        System.out.println("time = " + time.format(dtf));
    }
}
