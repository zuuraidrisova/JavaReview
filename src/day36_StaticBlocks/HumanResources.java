package day36_StaticBlocks;

public class HumanResources {


    static Developer developer1 = new Developer();
    static Developer developer2 = new Developer();
    static Developer developer3 = new Developer();
    static Developer developer4 = new Developer();
    static Developer developer5 = new Developer();

    /*
    public static void main(String[] args) {

        //if initialized inside main method then it will not be accessible outside main
        developer1.setDeveloperInfo("Namik", 84326, "Developer", 120000);

    }

     */

    static {

        developer1.setDeveloperInfo("Namik", 84326, "Developer", 120000);
        developer2.setDeveloperInfo("Kristina", 13654, "Developer", 100900);
        developer3.setDeveloperInfo("Bob", 12465, "Developer", 123763);


    }


}
