package day07_IfStatements;

public class Triangle {

    public static void main(String[] args) {
        /*
        Triangle is valid if sum of all three angles is equal to 180 degrees
        write a program that declares 3 integers as angles and check
        whether a triangle is valid or not
         */

        short angle1 = 30;
        short angle2 = 50;
        short angle3 = 100;

        int sumOfAngles = angle1 + angle2 + angle3;

        int validTriangle = 180;

        if(sumOfAngles == validTriangle){

            System.out.println(true);
        }else{

            System.out.println(false);
        }


    }


}
