package day18_DoWhileLoop;

public class Triangles {

    public static void main(String[] args) {

        for (int i = 0; i <= 7; i++){

            for(int j = 0; j <= i; j++){

                System.out.print("* ");
            }

            System.out.println();
        }


        System.out.println("===================================");

        for (int j = 7; j >= 0; j--){

            for(int i = 0; i <= j; i++){

                System.out.print("* ");
            }

            System.out.println();
        }


        System.out.println("===================================");

        char z = 'a';

        while(z <= 'z'){

            char ch = 'a';
            while (ch <= z){

                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();


            z++;
        }


        System.out.println("==================================================");

        char a = 'z';

        while(a >= 'a'){

            char ch = 'a';
            while (ch <= a){

                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();


            a--;

        }







    }
}
