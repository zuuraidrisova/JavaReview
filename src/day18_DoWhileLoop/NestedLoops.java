package day18_DoWhileLoop;

public class NestedLoops {

    public static void main(String[] args) {

        //nested If ==> loop inside another loop


        for(int k = 0; k < 5; k++){

            for(int i = 0; i <= 5; i++){

                System.out.print(i+" ");
            }

            System.out.println();

        }

        System.out.println();

        for(int k = 0; k < 8; k++){

            for(int i = 0; i < 8; i++){

                System.out.print("* ");
            }

            System.out.println();

        }




    }
}
