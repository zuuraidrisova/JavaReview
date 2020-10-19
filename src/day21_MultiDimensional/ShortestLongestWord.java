package day21_MultiDimensional;

public class ShortestLongestWord {

    public static void main(String[] args) {

        /*
         write a program that can return the longest string of text from an array
         */

        String [] names = { "Kubanychbek","Asan", "Zuura","Alina","Zeynep"};

        int maxLengthString = names [1].length();

        String longest = "";

        for(int i = 0; i < names.length; i++){

            if(names [i].length() > maxLengthString){

                maxLengthString = names[i].length();

                longest = names[i];

            }

        }


        System.out.println("longest word = " + longest);
        /*
        String [] names =  {"Sarybay", "Asan","Alina","Zuura"};

        int maxLengthString = names[0].length();
        String longestWord = "";

        for (int i = 0; i < names.length; i++){

            if (names[i].length() > maxLengthString){

                maxLengthString = names[i].length();
                longestWord = names[i];
            }

        }

        System.out.println(longestWord);

         */


        /*
         write a program that can return the shortest string of text from an array
         */

        int minLengthString = names[0].length();

        String shortestWord = "";

        for (int i = 0; i < names.length; i++){

            if(minLengthString > names[i].length()){

                minLengthString = names[i].length();

                shortestWord = names[i];

            }
        }

        System.out.println("shortestWord = " + shortestWord);


    }
}
