package day10_SwitchScanner;

public class DaysOfWeek {

    public static void main(String[] args) {

        //write a program that can display the days based on the numbers 1 - 7

        byte number = 6;
        String day = "";

        if(number >= 1 && number <= 7){

            day = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" :
                    (number == 3) ? "Wednesday" : (number ==  4) ? "Thursday" :
                    (number == 5) ? "Friday" : (number == 6) ?"Saturday" : "Sunday";


        }else{

            day = "Invalid";
        }

        System.out.println("day = " + day);
    }
}
