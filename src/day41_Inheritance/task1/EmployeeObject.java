package day41_Inheritance.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject {

    public static void main(String[] args) {

        Developer dev1 =  new Developer("Namik", "Senior Developer", 'M',120000, 90123);
        Developer dev2 =  new Developer("Zuura", "Senior Developer",'F',150000, 90234);
        Developer dev3 =  new Developer("Muhtar","Junior Developer",'M',120000, 90345);
        Developer dev4 =  new Developer("Sergy","Junior Developer", 'M',110000,90456);

        ArrayList<Developer> developers = new ArrayList<>();

        developers.addAll(Arrays.asList(dev1,dev2,dev3,dev4));

        for (int i = 0; i < developers.size(); i++){

            System.out.println(developers.get(i));
        }

        System.out.println("========================================================");


        for (Developer each: developers){

            each.code();
        }

        System.out.println("========================================================");

        for (Developer each: developers){

            each.fixBug();
        }

        System.out.println("========================================================");

        Tester tester1 = new Tester("Esma","SDET",'F',120000,90888);
        Tester tester2 = new Tester("Eric","SDET",'M',120000, 90777);
        Tester tester3 = new Tester("Aika","QA",'F',100000,90111);

        ArrayList<Tester> testers = new ArrayList<>();

        testers.addAll(Arrays.asList(tester1,tester2,tester3));

        for (int i = 0; i < testers.size(); i++){

            System.out.println(testers.get(i));
        }

        System.out.println("========================================================");

        for (Tester each: testers){

            each.reportBug();
        }

        System.out.println("========================================================");

        for (Tester each: testers){

            each.test();
        }

        System.out.println("=============================================================");

        BusinessAnalyst ba1 = new BusinessAnalyst("Venera","BA",'F',130000, 90436);

        System.out.println(ba1);

        System.out.println("=============================================================");

        ba1.gather();
        ba1.writeRequirements();
    }
}
