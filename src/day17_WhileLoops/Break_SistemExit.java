package day17_WhileLoops;

public class Break_SistemExit {

    public static void main(String[] args) {

        // break exits only the loop and switch

        for(int i = 0; i < 5; i++){

           if(i % 2 != 0){

               System.exit(0); //exits the entire program immediately
           }
        }
    }
}
