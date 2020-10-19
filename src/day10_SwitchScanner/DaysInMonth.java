package day10_SwitchScanner;

public class DaysInMonth {

    public static void main(String[] args) {

        /*
	4. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
 */

        int number = 6;

        String month = "";

        if(number >=1  && number <= 12){

            month = (number == 1) ? "January has 31 days" :(number == 2) ? "February has 28 days":
                    (number == 3) ? "March has 31 days" :(number == 4) ? "April has 30 days":
                    (number == 5) ? "May has 31 days" : (number == 6) ?" June has 30 days" :
                    (number == 7 )? "July has 31 days" : (number == 8) ? "August has 31 days" :
                    (number == 9) ? "September has 30 days" :(number == 10) ?"October has 31 days":
                    (number == 11) ? "November has 30 days" : "December has 31 days";


        }else{

            month = "Invalid Entry";

        }


        System.out.println("month = " + month);

    }
}
