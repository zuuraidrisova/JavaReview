package day42_InheritanceContinue.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {

    public static Employee employee4;
    public static Employee employee5;

    static {

        employee4 = new Employee();
        employee4.setEmployeeInfo("Messi", 32, 'M', 140_000, 13654,"FullTime");

        employee5 = new Employee();
        employee5.setEmployeeInfo("Aigerim", 18, 'F', 130_000, 65654,"FullTime");

    }
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setEmployeeInfo("Zuura", 29, 'F',120000,90123,"SDET");
        employee2.setEmployeeInfo("Sasha",32,'M',140000,90625,"Developer");
        employee3.setEmployeeInfo("Muhtar", 30, 'M',150000,90476,"Java Master");


        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(employee1,employee2,employee3, employee4,employee5));

        for (Employee each: employees){

            System.out.println(each);
        }



    }
}
