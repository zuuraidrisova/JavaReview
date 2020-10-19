package day45_ExceptionsContinue;

public class PushUps {

    public static void main(String[] args) {

        int pushups = 0;

        while ( pushups < 20){

            System.out.println("Do push-ups "+ (pushups+1));

            pushups++;

            try{
                Thread.sleep(1000);

            }catch (InterruptedException e){

            }


        }
    }
}
