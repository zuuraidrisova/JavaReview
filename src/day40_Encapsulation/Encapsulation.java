package day40_Encapsulation;

public class Encapsulation {
    /*
    Encapsulation ==> hiding instance variables==> marking them private

    private ==> makes limited access to its variables

    methods getter and setter ==> can help us access private data

    getter ==> read only or access data, returns private data
    setter ==> write only, change or set data

    these getter and setter methods should always be public

    getter and setter should always  be generated only in same class
                where private data is declared


    The meaning of Encapsulation, is to make sure that "sensitive" data is hidden
    from users. To achieve this, you must:

        declare class variables/attributes as private
        provide public get and set methods to access and update the value
        of a private variable

        The get method returns the variable value, and the set method sets the value.

        Why Encapsulation?
        Better control of class attributes and methods
        Class attributes can be made read-only  or write-only
        Flexible: the programmer can change one part of the code without affecting other parts
        Increased security of data
     */

    private long ssn;

    //getter is for reading other private data

    public long getSsn(){

        return ssn;
    }

    //setter is for modifying private data or setting private data
    // void is return type because we dont want to return anything,
    // we just want to set value

    public void setSsn(long ssn){

        this.ssn =  ssn;
    }

}
