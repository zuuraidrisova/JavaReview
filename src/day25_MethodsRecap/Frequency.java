package day25_MethodsRecap;

public class Frequency {

    public static void main(String[] args) {

        String str1 = "AaaaA";
        String str2 = "A";

        int count = frequency(str1,str2);

        System.out.println(count);


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
