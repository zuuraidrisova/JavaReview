package day09_Ternary_NestedIf;

public class Score {

    public static void main(String[] args) {

         /*

        90 - 100 = A
        80 - 89 = B
        70 - 79 = C
        60 - 69 = D
        0 -  59 = F

         */

        //we can only apply ternary if statement's body is returning the value and assign it to variable
        int score = 95;

        String grade = (score >= 90 && score <= 100) ? "Excellent" :
                        (score >= 80 && score <= 89) ? "Great" :
                        (score >= 70 && score <= 79)? "Good" :
                        (score >= 60 && score <= 69) ? "Satisfactory" :
                        (score >= 0 && score <= 59) ? "Bad" :"Invalid Score";

        System.out.println("grade = " + grade);

    }
}
