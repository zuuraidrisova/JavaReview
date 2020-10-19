package day13_StringClass;

public class StringClass {

    public static void main(String[] args) {
        /*

        A String in Java is actually an object, which contain methods that can perform
        certain operations on strings. For example, the length of a string can be found
         with the length() method.

         String literal ==> created by using  "" double quotes and  goes to String pool
         String pool is a special place to store string literals, it does not accept duplicates
          when there is same object created with similar value, it will refer to the same
          when similar visible text, same object will be shared with  2 variables
                String str = "Muhtar";

         String with new keyword ==> goes to heap, because when u create a string with new keyword
         it creates an independent memory in heap

         JAVA HEAP  : memory location where all objects are stored

                String str = new String("Zuura");

        String is immutable ==> meaning it cannot be changed once it is created

        BUT: we can reassign the value of a variable,original object will never be changed
                and a new object will be created

        String represents the sequence of characters, so each character
        has its own index number, starting from zero

        String is a class,which is presented in java.lang  package,
        no need to import because it is automatic
         */

        String str1 = "Cat";//goes to pool
        String str2 = new String("Cat"); //goes to heap

        System.out.println(str1+" : "+str2);
        System.out.println(str1 == str2);//false, because they are two different objects

        String str3 = "Cat"; //goes to pool, no new object will be created,
                    // because there is already one

        System.out.println(str1 == str3); //true because same value

        String str4 = new String("Cat");

        System.out.println(str2 == str4); //false because they belong to different memory


    }
}
