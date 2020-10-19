package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map_KeySet_Values {

    public static void main(String[] args) {

        LinkedHashMap<String, String> fb = new LinkedHashMap<>();

        fb.put("Tester1", "test1");
        fb.put("Tester2", "test2");
        fb.put("Tester3", "test2");
        fb.put("Tester3", "test3");//only the latest value will  be kept
        fb.put("Tester4", "test4");
        fb.put("Tester5", "test5");

        System.out.println("fb = " + fb);

        System.out.println("fb.size() = " + fb.size());

        System.out.println("===============================================");

        //we want to loop and  print out only usernames == keys
        // keySet() returns collection of Set, because Set does not accept duplicates too

       for(String eachKeys :fb.keySet()){//iterate keys and gets only keys

           System.out.println("Keys: "+eachKeys);
       }

        System.out.println("===============================================");

       for(String eachValues : fb.values()){//iterate values and gets only values

           System.out.println("Values: "+eachValues);
       }

        System.out.println("===============================================");

        List<String> usernames = new ArrayList<>(fb.keySet());

        System.out.println("usernames = " + usernames);

        List<String> passwords = new ArrayList<>(fb.values());

        System.out.println("passwords = " + passwords);

        System.out.println("===============================================");

        Map<String,Integer> students = new LinkedHashMap<>();

        students.put("Zuura", 90);
        students.put("Sary", 70);
        students.put("Anna",90);
        students.put("Namik",75);
        students.put("Rahman",93);

        System.out.println("students = " + students);

        //iterate and print students who could not make 80

        for (String each: students.keySet()){

            int eachValue = students.get(each);

            if(eachValue < 80) {

                System.out.println("Each student: " + each);
            }
        }

        System.out.println("===========================================");

        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();

        for (String each: students.keySet()){// each is name of student

            int eachScore = students.get(each);// eachScore is score of student

            if(eachScore > 80){

                goodStudents.put(each,eachScore);
            }else{

                badStudents.put(each, eachScore);
            }

        }

        System.out.println("goodStudents = " + goodStudents);
        System.out.println("badStudents = " + badStudents);


    }
}
