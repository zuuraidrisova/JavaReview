package day40_Encapsulation;

public class Credentials {

    /*two instance variables:
            username and password cannot be accessed directly
           generate getter and setter for private data, so we can access them
           outside class
     */

    private String userName;
    private String password;

    public String getUserName(){

        return userName;
    }

    public void setUserName(String userName){

        this.userName = userName;
    }

    public String getPassword(){

        return password;
    }

    public void setPassword(String password){

        this.password = password;
    }


}

class CredentialsObject{

    public static void main(String[] args) {

        Credentials credential1 = new Credentials();

        System.out.println("credential1.getUserName() = " + credential1.getUserName());
        System.out.println("credential1.getPassword() = " + credential1.getPassword());
        //null because credentials are not set


        //now we set the values to private data
        credential1.setUserName("zuuraidrisova");
        credential1.setPassword("zuura90");


        System.out.println("credential1.getUserName() = " + credential1.getUserName());
        System.out.println("credential1.getPassword() = " + credential1.getPassword());

    }
}
