package day10_SwitchScanner;

public class ConvertNumericToAlphabet {

    public static void main(String[] args) {
        /*
         write a java program that can convert numbers between 0 ~ 9 to words,
         if the number is greater than 9 or less than zero, out put should be "Invalid".
         */

        int num = 8;
        String word = "";


        if(num > 0 && num < 9 ){

            if(num == 0){

                word = "Zero";

            }else if(num == 1){

                word = "One";

            }else if(num == 2){

                word = "Two";

            }else if(num == 3){

                word = "Three";

            }else if(num == 4){

                word = "Four";

            }else if(num == 5){

                word = "Five";

            }else if(num == 6){

                word = "Six";

            }else if(num == 7){

                word = "Seven";

            }else if(num == 8){

                word = "Eight";

            }else{

                word = "Nine";

            }

        }else{

            word = "Invalid";

        }

        System.out.println("word = " + word);


        String result = (num == 0) ? "Zero" : (num == 1) ? "One" :(num ==2) ? "Two":
                (num ==3) ? "Three" : (num ==4) ? "Four" : (num == 5) ? "Five":
                        (num == 6) ? "Six" : (num == 7) ?"Seven" :(num == 8) ? "Eight" :
                                (num == 9) ? "Nine" : "Invalid";

        System.out.println("result = " + result);
    }
}
