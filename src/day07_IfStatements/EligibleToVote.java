package day07_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        //eligibility to vote is 18  years

        int age = 13;
        boolean citizen = true;


        if(age >= 18 && citizen){

            System.out.println("Eligible to vote");
        }else{

            System.out.println("Not Eligible to vote");
        }

    }
}
