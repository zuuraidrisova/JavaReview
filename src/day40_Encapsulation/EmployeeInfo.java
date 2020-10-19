package day40_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeInfo {

    private double salary;
    private long ssn;
    private int id;
    private String address;


    public double getSalary() {
        return salary;
    }

    public long getSsn() {
        return ssn;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}

class BOA{

    public static void main(String[] args) {

        //we create an object of EmployeeInfo
        EmployeeInfo emp1 = new EmployeeInfo();
        EmployeeInfo emp2 = new EmployeeInfo();
        EmployeeInfo emp3 = new EmployeeInfo();
        EmployeeInfo emp4 = new EmployeeInfo();


        //we set all private data
        emp1.setAddress("Euclid");
        emp2.setAddress("Bay Village");
        emp3.setAddress("Rocky river");
        emp4.setAddress("Westlake");

        emp1.setId(90123);
        emp2.setId(90234);
        emp3.setId(90345);
        emp4.setId(90567);

        emp1.setSalary(110000);
        emp2.setSalary(120000);
        emp3.setSalary(130000);
        emp4.setSalary(140000);

        emp1.setSsn(821641);
        emp2.setSsn(281481);
        emp3.setSsn(193724);
        emp4.setSsn(283160);

        ArrayList<EmployeeInfo> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(emp1,emp2,emp3,emp4));

        for (int i =0; i < employees.size(); i++){

            System.out.println(employees.get(i).getAddress());
        }

        System.out.println("==================================================");

        for (EmployeeInfo each : employees){

            System.out.println(each.getSalary());
        }

        System.out.println("==================================================");

        for (EmployeeInfo each: employees){

            System.out.println(each.getId());
        }

        System.out.println("==================================================");

        for (int i = 0; i < employees.size(); i++){

            System.out.println(employees.get(i).getSsn());
        }
    }



}