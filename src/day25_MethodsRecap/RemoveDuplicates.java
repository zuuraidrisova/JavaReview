package day25_MethodsRecap;

public class RemoveDuplicates {

    public static void main(String[] args) {


        String str = "Zuuurraa";

       String noDup =  removeDuplicates(str);

        System.out.println("noDup = " + noDup);

    }

    public static String removeDuplicates(String str){

        String noDup = "";

        for(int i = 0; i < str.length(); i++){

            if(!noDup.contains(""+str.charAt(i))){

                noDup += str.charAt(i);
            }
        }

        return  noDup;

    }


    public static int frequency(String str1, String str2){

        int count = 0;

        while(str1.contains(str2)){

            count++;

            str1 =str1.replaceFirst(str2, "");


        }

        return  count;

    }


}
