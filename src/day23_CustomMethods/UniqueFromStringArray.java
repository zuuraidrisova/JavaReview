package day23_CustomMethods;

public class UniqueFromStringArray {


    public static void main(String[] args) {

 /*
          Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
         */


        String [] strArray = {"A", "A", "B", "C", "C"};

        for(int i = 0; i < strArray.length; i++){

            int count = 0;

            for(int j = 0; j < strArray.length; j++){

                if(strArray[i].equals(strArray[j])){

                    count++;

                }
            }

            if(count == 1){

                System.out.println(strArray[i]);
            }
        }


        System.out.println("=================================");

        for(String each : strArray){

            int count2 = 0;

           for (String each2 : strArray){

               if(each.equals(each2)){

                   count2++;

               }
           }

           if(count2 == 1){

               System.out.println(each);
           }
        }


        System.out.println("================================");


        String [] arr2 = { "Ali","Ali","Sary","Zuura"};


        for(int i = 0; i < arr2.length; i++){

            int count = 0;

            for(int j = 0; j < arr2.length; j++){

                if(arr2[i].equals(arr2[j])){

                    count++;

                }
            }

            if(count == 1){

                System.out.println(arr2[i]);
            }
        }


        System.out.println("=====================");

        //String str = "AAABBCC" ==>Frequency

        String str = "AAABBC";

        String result = "";

        char [] ch = str.toCharArray();

        for(int i = 0; i < ch.length; i++){

            int count = 0;

            for(int j = 0; j < ch.length; j++){

                if(ch[i] == ch[j]){

                    count++;

                }
            }


            if(count == 1){

                System.out.println(ch[i]);
            }
        }


    }
}
