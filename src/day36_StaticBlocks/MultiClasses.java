package day36_StaticBlocks;

public class MultiClasses {

    //in any java file u can have several classes,
    // but only one public class, others default
    //public class name must match with file name...
    //this class is public and it matches with MultiClass.java
    // public class position does not matter, it can come first, last, in the middle
    //we cannot run all classes at once

    public static void main(String[] args) {

        System.out.println("Public class");
    }
}

class Tester{

    public static void main(String[] args) {

        System.out.println("Tester class");
    }
}

class ScrumTeam{

    public static void main(String[] args) {

        System.out.println("ScrumTeam class");
    }

}
