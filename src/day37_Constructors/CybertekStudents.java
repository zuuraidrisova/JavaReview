package day37_Constructors;

public class CybertekStudents {

    static String schoolName;
    String name;
    int groupNumber;
    String batch;

    public CybertekStudents(String name, int groupNumber, String batch) {

        schoolName = "Cybertek";
        this.name = name;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Name: "+name+" GroupNumber: "+groupNumber+" Batch: "+batch+" SchoolName: "+schoolName;

    }


}
