package day19_Arrays;

public class Frequency {

    public static void main(String[] args) {

        /*
        write a program that can return the frequency of the characters in a string
		Ex: "AABCBCA" ==> "A3B2C2"

         */

        String str = "AABCBCA";

        String result = "";

        for(int i = 0; i < str.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    count ++;
                }
            }

            if(!result.contains(""+str.charAt(i))){

                result += str.charAt(i) +""+ count;
            }

        }


        System.out.println("result = " + result);

    }
}
