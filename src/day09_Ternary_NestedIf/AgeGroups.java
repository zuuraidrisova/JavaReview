package day09_Ternary_NestedIf;

public class AgeGroups {

    public static void main(String[] args) {
         /*
        write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
         */

        int age = 85;
        String result = "";


        if(age > 0 && age < 3){

            result = "Baby";

        }else if(age >=3 && age <= 5){

            result = "Toddler";

        }else if(age >= 6 && age <= 9){

            result = "Kid";

        }else if(age >= 10 && age <= 12){

            result = "Pre-teen";

        }else if(age >= 13 && age <= 17){

            result = "Teenager";

        }else if(age >= 18 && age <= 20){

            result = "Yound adult";

        }else if(age >= 21 && age <= 39){

            result = "Adult";

        }else if( age >= 40 && age <= 49){

            result = "Young Middle-Aged Adult";

        }else if(age >= 50 && age <= 54){

            result = "Middle-Aged Adult";

        }else if(age >= 55 && age <= 64){

            result = "Very Young Senior Citizen";

        }else if(age >= 65 && age <= 74){

            result ="Young Senior Citizen";

        }else if(age >= 75 && age <= 84){

            result = "Senior Citizen";

        }else if(age >= 85){

            result = "Old Senior Citizen";

        }

        System.out.println("result = " + result);



    }
}
