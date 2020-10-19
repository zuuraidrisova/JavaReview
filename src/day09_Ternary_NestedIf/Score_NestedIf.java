package day09_Ternary_NestedIf;

public class Score_NestedIf {

    public static void main(String[] args) {

        int score = 98;
        String grade = "";


        if(score >= 0 && score <= 100){

            if(score >= 90){

                grade = "A";

            }else if(score >= 80){

                grade = "B";

            }else if(score >= 70){

                grade = "C";

            }else if(score >= 60){

                grade = "D";

            }else{

                grade = "F";
            }



        }else{

            grade = "Invalid score";
        }


        System.out.println("grade = " + grade);


        //with ternary and nested if

        int score2 = 73;
        String grade2 = "";


        if(score2 >= 0 && score <= 100){

            grade2 = (score2 >= 90) ? "A" : (score2 >= 80) ? "B" : (score2 >= 70) ? "C":
                    (score2 >= 60) ? "D" : "F";

        }else{

            grade2 = "Invalid score!";

        }


        System.out.println("grade2 = " + grade2);
    }
}
