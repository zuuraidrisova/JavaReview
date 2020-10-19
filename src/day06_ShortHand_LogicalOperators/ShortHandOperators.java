package day06_ShortHand_LogicalOperators;

public class ShortHandOperators {

    public static void main(String[] args) {

        /*
        Shorthand operators:

            += : addition assignment
                x += 10  is same as x = x + 10

            -+ : subtraction assignment
                X -= 10  is same as x = x - 10

            *= : multiplication assignment
                x *= 10 is same as x = x * 10
                
            /= : division assignment
                x /= 10 is same as x = x / 10
                
            %= : modulus assignment
               x %= 10 is same as x = x % 10

         */

        int x = 20;
            x += 10; //x = 20 + 10;
            System.out.println("x = " + x);
            
        String schoolName = "Cybertek";
        schoolName+="1234";// same as schoolName =  schoolName + "1234";

        System.out.println("schoolName = " + schoolName);

        int num = 400;
        num /= 20 + 10; //first u add 20+10 = 30 and then divide 400 to 30 and u get 13

        System.out.println("num = " + num);


        int a = 100;
          a %= 10 + 20; // 10


        System.out.println("a = " + a);
        
        
        
    }

}
