package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {

    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();

        employeeInfo.put("Zuura", 120000.0);
        //now its size is 1, because we put one pair of data

        System.out.println("employeeInfo = " + employeeInfo);

       double Zsalary =   employeeInfo.get("Zuura");//to get the value of key

        System.out.println("Zuura salary = " + Zsalary);

        employeeInfo.put("Zarina", 100000.0);//now size is 2, so map is growable in nature

        System.out.println("employeeInfo = " + employeeInfo);

        System.out.println("employeeInfo.size() = " + employeeInfo.size());
        //to get the size use size() method

       double zarinaSalary =  employeeInfo.get("Zarina");

        System.out.println("zarinaSalary = " + zarinaSalary);

        //System.out.println(employeeData.get("Bakhodir"));
        //when map does not contain , it gives null

        System.out.println("======================================================");


        //map does not have index numbers, it is unordered data structure
        //but we use key of map to manipulate with data

        employeeInfo.remove("Zuura");//it is gonna remove zuura info
        System.out.println("employeeInfo = " + employeeInfo);//because we removed on key, now size is 1 again

        System.out.println("employeeInfo.size() = " + employeeInfo.size());
    }
}
