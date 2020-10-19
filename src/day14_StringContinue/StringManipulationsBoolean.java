package day14_StringContinue;

public class StringManipulationsBoolean {

    public static void main(String[] args) {

        // isEmpty()	Checks whether a string is empty or not, returns boolean

         String str = "";

        boolean empty =  str.isEmpty();

        System.out.println("empty = " + empty);

        String str2 = "Hello";

        boolean empty2 = str2.isEmpty();

        System.out.println("empty2 = " + empty2);

        String username = "";

        if(username.isEmpty()){

            System.out.println("Please enter your username");

        }

        //equals(str)	Compares two strings. Returns true if the strings are equal, and false if not
                        //checks if 2 strings visible text is equal or not
                        // == checks if 2 strings have same memory location

        String s1 = "Cat"; //goes to string pool
        String s2 = new String("Cat");//goes to heap memory

        boolean a = s1.equals(s2);//true because it checks just the visible text of strings
        boolean b = s1 == s2;//false because it checks memory locations, which are 2 different

        System.out.println("a = " + a);//true
        System.out.println("b = " + b);//false

        //equalsIgnoreCase(value)	Compares two strings, ignoring case considerations

        String str3 = "cat";

       boolean c =  s1.equalsIgnoreCase(str3);//true because method does not care abt case sense

        System.out.println("c = " + c); //true

        //

        String email = "Zuuraidrisova@gmail.com";
        String gmail = "zuuraidrisova@gmail.com";

        boolean gmailAccount = email.equalsIgnoreCase(gmail);

        System.out.println("gmailAccount = " + gmailAccount);

        // contains(str)	Checks whether a string contains a sequence of characters

       boolean d = gmail.contains("@gmail");

        System.out.println("d = " + d);

        //valid username should not contain space

        if(gmail.contains(" ")){

            System.out.println("It is not valid username");
        }else{

            System.out.println("It is a valid username");
        }

        //endsWith()	Checks whether a string ends with the specified character(s)

        //startsWith()	Checks whether a string starts with specified characters

        String us = "United States";

        if(us.startsWith("U") && us.endsWith("s")){

            System.out.println("It is a valid country name");
        }

        // every website starts with http, check

        String website = "https://www.w3schools.com";

        if(website.startsWith("http")){

            System.out.println("it is a valid website");
        }else{
            System.out.println("It is not a valid website");
        }

    }
}
