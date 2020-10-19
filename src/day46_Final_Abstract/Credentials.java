package day46_Final_Abstract;

public class Credentials {

    private final String username = "zuura";
    private final String password = "zuura90";

    /*
    we can only generate getter for final variables, because they cannot be reassigned
     */
    public String getUsername(){

        return username;
    }


    public String getPassword(){

        return password;
    }

}
