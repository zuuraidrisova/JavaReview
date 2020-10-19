package day17_WhileLoops;

public class WhileEvenNumbers {

    public static void main(String[] args) {

        //write a program that sums even numbers between 0 - 100 using while loop
        int i = 0;//initialization

        int sumEven = 0; // to store sum of even numbers

        while(i  <= 100){ //condition

            if(i % 2 == 0){ //check if num is even or odd

                System.out.print(i+" ");
                sumEven += i; //adding
            }

            i++; //iterator to make loop stop at some point
        }

        System.out.println();
        System.out.println("sumEven = " + sumEven);
    }
}
