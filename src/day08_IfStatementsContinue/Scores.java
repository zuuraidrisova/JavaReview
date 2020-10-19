package day08_IfStatementsContinue;

public class Scores {

    public static void main(String[] args) {
        /*

        90 - 100 = A
        80 - 89 = B
        70 - 79 = C
        60 - 69 = D
        0 -  59 = F

         */

        int score = 80;
        String grade = "";


        if(score >= 90 && score <= 100){

            grade = "A";

        }else if(score >= 80 && score <=89){

            grade = "B";

        }else if(score >= 70 && score <= 79){

            grade = "C";

        }else if( score >= 60 && score <= 69){

            grade = "D";

        }else if(score >= 0 && score <= 59){

            grade = "F";
        }else{

            grade = "Invalid grade!";
        }

        System.out.println("grade = " + grade);
    }
}
