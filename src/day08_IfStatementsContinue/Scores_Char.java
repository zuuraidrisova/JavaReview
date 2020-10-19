package day08_IfStatementsContinue;


public class Scores_Char {

    public static void main(String[] args) {

         /*

        90 - 100 = A
        80 - 89 = B
        70 - 79 = C
        60 - 69 = D
        0 -  59 = F

         */

        int score = 45;
        char grade = 'A';


        if(score >= 90 && score <= 100){

            grade ='A';

            System.out.println("grade = " + grade);

        }else if(score >= 80 && score <=89){

            grade = 'B';
            System.out.println("grade = " + grade);

        }else if(score >= 70 && score <= 79){

            grade = 'C';
            System.out.println("grade = " + grade);

        }else if( score >= 60 && score <= 69){

            grade = 'D';
            System.out.println("grade = " + grade);

        }else if(score >= 0 && score <= 59){

            grade = 'F';
            System.out.println("grade = " + grade);

        }else{

            System.out.println("Invalid Score");
        }

    }
}
