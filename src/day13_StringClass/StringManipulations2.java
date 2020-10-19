package day13_StringClass;

public class StringManipulations2 {

    public static void main(String[] args) {

        //substring(beginningIndex, endingindex)	Extracts the characters from a string,
        // beginning at a specified start position, and through the specified number of character

       String str = "Cybertek School is the best school";

       String schoolName = str.substring(0, 15);

        System.out.println("schoolName = " + schoolName);

        String fullName = "Zuura Idrisova";

        String firstName = fullName.substring(0, 5);
        String lastName = fullName.substring(6);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        String email = lastName.concat("_").concat(firstName).concat("@gmail.com");

        System.out.println("email = " + email);

        //replace(old, new)	old value will be replaced with a new value, replaces all matching ones

        String like = "I like C# programming language";

        like = like.replace("C#", "Java");

        System.out.println(like);

        //replaceFirst()	Replaces the first occurrence of a substring that matches
        // the given regular expression with the given replacement

        String r = "I like Java, Java is fun";

        r = r.replaceFirst("Java", "C++");

        System.out.println(r);

    }
}
