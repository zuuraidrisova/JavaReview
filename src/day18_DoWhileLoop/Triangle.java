package day18_DoWhileLoop;

public class Triangle {

    public static void main(String[] args) {

        //print triangle

        for(int i = 1; i <= 9; i++){

            for(int k = 1; k <= i; k++ ){

                System.out.print("* ");
            }

            System.out.println();
        }

        //flip the triangle


        for(int i = 9; i >= 0; i--){

            for (int j = 0; j <= i; j++){

                System.out.print("* ");
            }

            System.out.println();
        }

        for (char z = 'a'; z <= 'z'; z++){

            for(char ch = 'a'; ch <= z; ch++){

                System.out.print(ch+" ");
            }

            System.out.println();

        }


        for(char z = 'z'; z >= 'a'; z--){

            for(char ch = 'a'; ch <= z; ch++){

                System.out.print(ch+" ");
            }

            System.out.println();


        }



    }
}
