package day21_MultiDimensional;

import java.util.Arrays;

public class ScrumTeam {

    public static void main(String[] args) {

        String [] devTeam = {"Zeynep","Heider","Jovid"};

        String [] testers = {"Rahman","Ali","Osman","Zuura"};

        String [] [] scrumTeam = {devTeam, testers};

        scrumTeam[0][2] = "Jean";

        System.out.println(Arrays.deepToString(scrumTeam));

        String employee = scrumTeam[1][2];

        System.out.println("employee = " + employee);


        for (String [] each: scrumTeam){

            for (String eachEmp : each){

                System.out.println("eachEmp = " + eachEmp);
            }

        }

        System.out.println("======================");

        for (String each: scrumTeam[1]){

            System.out.println("each = " + each);
        }



    }
}
