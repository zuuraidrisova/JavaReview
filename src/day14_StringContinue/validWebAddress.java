package day14_StringContinue;

public class validWebAddress {

    public static void main(String[] args) {

        /*
    write a program that can validate if a web address is valid
    valid web address:
            MUST start with www.
            MUST ends with .com, .edu, .net, .gov
     */
        String webAddress = "www.google.com";

        if(webAddress.startsWith("www")){

            if(webAddress.endsWith(".com") || webAddress.endsWith(".edu")
                    || webAddress.endsWith(".net") || webAddress.endsWith(".gov")){

                System.out.println("It is a valid web address");
            }else{

                System.out.println("Website does not have a valid ending");
            }
        }else{

            System.out.println("Website does not have proper start");
        }




    }
}
