package day50_PolymorphismContinue;

public class Encapsulation {

    private String userName = "Cybertek";

    public String  getUserName(){

        return userName;

    }

    public void setUserName(String userName){

        this.userName = userName;
    }



}

class Test{

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

        String name = obj.getUserName();

        System.out.println("name = " + name);

        obj.setUserName("MIT");

        System.out.println("obj.getUserName() = " + obj.getUserName());


    }
}