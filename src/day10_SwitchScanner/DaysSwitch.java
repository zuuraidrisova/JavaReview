package day10_SwitchScanner;

public class DaysSwitch {

    public static void main(String[] args) {

        int num = 6;

        String day;

        switch (num){

            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid";
                break;

        }

        System.out.println("day = " + day);

        System.out.println("================================");

        char ch = 'B';
        String result;


        switch (ch){

            case 'A':
                result = "A";
                break;
            case 'B':
                result = "B";
                break;
            case 'C':
                result = "C";
                break;
            case 'D':
                result = "D";
                break;
            case 'E':
                result = "E";
                break;
            default:
                result = "Invalid";
                break;

        }

        System.out.println("result = " + result);


    }

}
