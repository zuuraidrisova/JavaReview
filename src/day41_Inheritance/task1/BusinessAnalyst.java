package day41_Inheritance.task1;

public class BusinessAnalyst extends Employee {
       /*
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender ==>  all inherited
     		actions: writingRequiremnts, gathering
     		create a constructor that can initialize all the attributes of businessAnalyst
     */
       public BusinessAnalyst(String name, String jobTitle, char gender, double salary, long id){

           this.name = name;
           this.jobTitle = jobTitle;
           this.gender = gender;
           this.salary = salary;
           this.id = id;

       }

    public void writeRequirements(){

        System.out.println(name+" is writing requirement documents");
    }

    public void gather(){

        System.out.println(name+" is gathering information");
    }


}
