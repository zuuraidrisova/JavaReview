package day08_IfStatementsContinue;

public class DaysInMonths {

    public static void main(String[] args) {

        int month = 12;

        String result = "";

        if(month == 1){

            result = "January has 31 days";

        }else if( month == 2){

            result = "February has 28 days";

        }else if(month == 3){

            result = "March has 31 days";

        }else if(month == 4){

            result = "April has 30 days";

        }else if(month == 5){

            result = "May has 31 days";

        }else if(month == 6){

            result = "June has 30 days";

        }else if(month == 7){

            result = "July has 31 days";

        }else if(month == 8){

            result = "August has 31 days";

        }else if(month == 9){

            result = "September has 30 days";

        }else if(month == 10){

            result = "October has 31 days";

        }else if(month == 11){

            result = "November has 30 days";

        }else if(month == 12){

            result = "December has 31 days";

        }else{

            result = "Invalid number of month";

        }

        System.out.println("result = " + result);


    }
}
