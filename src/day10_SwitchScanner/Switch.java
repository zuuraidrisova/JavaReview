package day10_SwitchScanner;

public class Switch {

    public static void main(String[] args) {
        /*
        Use the switch statement to select one of many code blocks to be executed.

        This is how it works:

            The switch expression is evaluated once.
            The value of the expression is compared with the values of each case.
            If there is a match, the associated block of code is executed.
            The break and default keywords are optional, and will be described later in this chapter

            ==>  break keyword, it EXITS the switch block.
            ==> The default keyword specifies some code to run if there is no case match

            Syntax:

                switch(expression) {
                        case x:
                             // code block
                            break;
                        case y:
                             // code block
                             break;
                         default:
                             // code block
                    }

                    SWITCH CANNOT BE BOOLEAN, FLOAT, DOUBLE, LONG

         */

        String result;

        switch (4){

            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            default:
                result = "invalid";
                break;
        }

        System.out.println("result = " + result);


    }

}
