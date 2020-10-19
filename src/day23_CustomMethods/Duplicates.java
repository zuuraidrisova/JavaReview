package day23_CustomMethods;

public class Duplicates {

    public static void main(String[] args) {

        String str = "AAABBCCCD";

        String noDup = "";

        for (int i = 0; i < str.length(); i++){

            if(!noDup.contains(""+str.charAt(i))){

                noDup += str.charAt(i);

            }
        }

        System.out.println("str = " + str);
        System.out.println("noDup = " + noDup);


    }
}
