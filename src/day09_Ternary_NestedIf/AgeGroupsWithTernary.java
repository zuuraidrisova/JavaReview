package day09_Ternary_NestedIf;

public class AgeGroupsWithTernary {

    public static void main(String[] args) {

        int age = 45;
        String ageGroup = "";

        if(age <= 120 && age > 0){

            ageGroup = (age < 21) ? "Teenager" : (age < 55) ? "Adult" : "Senior";

        }else{

            ageGroup = "Invalid age!";
        }


        System.out.println("ageGroup = " + ageGroup);
    }
}
