package day21_MultiDimensional;

public class GmailsForEach {

    public static void main(String[] args) {

        /*
         given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com",
         "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array
    print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
         */


        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com",
                "Cybertek@hotmail.com", "Cybertek@outlook.com"};


        for(String eachEmails : emails){

            if(eachEmails.endsWith("gmail.com")){
                continue;
            }
            System.out.println(eachEmails);

        }

        /*


        for (String each: emails) {

            if(each.endsWith("gmail")){
                continue;
            }

            System.out.println(each);
        }

         */





    }
}
