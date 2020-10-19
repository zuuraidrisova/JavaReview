package day18_DoWhileLoop;

public class DoWhileLOOP {

    public static void main(String[] args) {

        /*
        do/while loop. The loop will always be executed at least once,
        even if the condition is false, because the code block is executed
         before the condition is tested
         */

        int num = 10;

        do{

            System.out.println("Hello");
            num++;

        }while(num < 3 );

        //print all even numbers between 0-100 by comma use do/while loop

        int number = 0;

        do {


            if(number % 2 == 0){

                System.out.print(number+" ");
            }
          number++;

        }while(number <= 100);


        System.out.println();


        //skip when x reaches 3
        int x = 0;

        do{

            if(x == 3){

                x++; //make sure iterator is not skipped
                continue;
            }

            System.out.println(x);

            x++;

        }while (x <= 5);


        //printing all odd numbers

        int odd = 0;

        do{

            if(odd % 2 != 0){

                System.out.print(odd+" ");
            }

            odd++;

        }while(odd <= 100);



    }
}
