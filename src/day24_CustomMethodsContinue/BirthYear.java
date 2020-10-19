package day24_CustomMethodsContinue;

public class BirthYear {


    public static void main(String[] args) {

       int age =  birthYear(2021);

        System.out.println("age = " + age);

    }

    public static int birthYear(int year){


        int currentYear = 2020;

        int age = 0;

        if(year > currentYear){

            System.out.println("You are not born yet!");
        }else{

            age = currentYear - year;
        }
        return  age;
    }



}
