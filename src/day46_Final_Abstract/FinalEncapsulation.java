package day46_Final_Abstract;

public class FinalEncapsulation {

    private final int data1 = 200;

    private final int data2 = 200;


    public int getData1(){

        return data1;

    }

    public int getData2(){

        return data2;
    }

// when there is private final data , u can generate only getter to read only,
// but u cannot generate setter because u cannot reassign the final values


}
