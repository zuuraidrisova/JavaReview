package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeDate {
    /*

    we can import the java.time package to work with the date and time

    LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
    LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
    LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
    DateTimeFormatter	Formatter for displaying and parsing date-time objects

    To display the current date, import the java.time.LocalDate class,
            and use its now() method:

    To display the current time (hour, minute, second, and nanoseconds),
     import the java.time.LocalTime class, and use its now() method:

     You can use the DateTimeFormatter class with the ofPattern() method in the same
      package to format or parse date-time objects.


     */
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); //just date

        System.out.println("date = " + date);

        LocalTime time =  LocalTime.now(); //just time

        System.out.println("time = " + time);

        LocalDateTime dateTime = LocalDateTime.now(); //date and time together

        System.out.println("dateTime = " + dateTime);



    }



}
