package day39_AccessModifiers;

public class CheckInfo {

    public static void main(String[] args) {


        //all info below belong to different class but they have public or default AM
        System.out.println("name = " + PersonalInfo.name);
        System.out.println("age = " + PersonalInfo.age);
        System.out.println("gender = " + PersonalInfo.gender);
        System.out.println("id = " + PersonalInfo.id);

        //below info have private AM so not accessible
        // System.out.println("Grade: "+PersonalInfo.grade);
        // System.out.println("SSN: "+PersonalInfo.SSN);

    }
}
