package day16_BreakContinueLoops;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 1; i <=5  ; i++) {

            System.out.println("Hello");
            break; // exits the loop immediately
        }

        System.out.println("========================");

        for (int i = 1; i <=5  ; i++) {

            if(i == 3){ //when i reaches 3, break will exit the loop

                break;
            }
            System.out.println("Hello");

        }

        System.out.println("=======================");

        for(char ch = 'a'; ch <= 'z'; ch++){

            System.out.println(ch);

            if (ch == 'd') { // it will print d and then exit the loop

                break;
            }

        }

        System.out.println("========================");

        for (int i = 1; i <=5  ; i++) {

            if(i == 3){// if i reaches 3 , continue will skip it

                continue;
            }
            System.out.println(i);

        }

        System.out.println("=======================");

        //skip printing z, u , r ,a
        for(char ch = 'a'; ch <= 'z'; ch++){

            if(ch == 'a' || ch == 'r' || ch == 'u' || ch == 'z'){

                continue;
            }
            System.out.print(ch+" ");


        }

        System.out.println("=======================");

        //skip numbers divisible by 3 or 5

        for (int i = 1; i <=100  ; i++) {

            if(i % 3 == 0 || i % 5 == 0){

                continue;
            }
            System.out.print(i+" ");

        }


    }
}
