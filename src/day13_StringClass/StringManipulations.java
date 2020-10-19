package day13_StringClass;

public class StringManipulations {

    //JAVA IS A VERY CASE-SENSITIVE PROGRAMMING LANGUAGE

    public static void main(String[] args) {

        String str = "Cybertek";

        //charAt(index)	Returns the character at the specified index (position)

        char ch1 = str.charAt(3);

        System.out.println("Character at given index position = " + ch1);

        //length()	Returns the length of a specified string
          //  length is always one unit above the max index

        int num = str.length();

        System.out.println("Total number of characters: "+num);

        String str2 = "Today is a great day, Java is fun!";

        int len = str2.length();

        System.out.println("len = " + len);

        //concat(value)	Appends a string to the end of another string, same as +
        String s = "Cybertek";
           s = s.concat(" School");//we have to reassign it, because otherwise it will
        // always point to the original, since String is immutable

        System.out.println(s);

        String s1 = "Java";
         s1 = s1.concat(" is a fun programming language");// reassigning, and new object is created

        System.out.println(s1);

        //toLowerCase()	Converts a string to lower case letters

        String name = "CYBERTEK";

        name = name.toLowerCase();//we have to reassign to get a new object

        System.out.println(name);

        //toUpperCase()	Converts a string to upper case letters

        String name1 = "cybertek school";

        name1 = name1.toUpperCase();//we have to reassign to get a new object

        System.out.println(name1);

        //trim()	Removes whitespace from both ends of a string
        String trim = "    Today is a great day";

        trim = trim.trim();

        System.out.println("trim = " + trim);

    }
}
