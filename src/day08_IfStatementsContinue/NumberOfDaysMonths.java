package day08_IfStatementsContinue;

public class NumberOfDaysMonths {

    public static void main(String[] args) {

        //write a program that can find the number of days in a month

        // 28 days: 2
        // 30 days: 4,6,9,11
        //31 days : 1,3,5,7,8,10,12

        byte numberOfMonth = 11;

        if(numberOfMonth == 2){

            System.out.println("Month has 28 days");

        }else if( numberOfMonth == 4 || numberOfMonth == 6 || numberOfMonth ==9 || numberOfMonth == 11){

            System.out.println("Month has 30 days");
        }else{

            System.out.println("Month has 31 days");
        }



    }
}
