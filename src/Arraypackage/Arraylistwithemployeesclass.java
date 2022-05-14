package Arraypackage;

import java.util.ArrayList;

public class Arraylistwithemployeesclass {

    public void EmployeedetailsO(){
        //Arraylist <Data type> obj_name=New Arraylist<Data type>();

        ArrayList <EmployeesData> employeeslist=new ArrayList<EmployeesData>();

        EmployeesData emp1=new EmployeesData("Radhe",56000,"IT");
       EmployeesData emp2=new EmployeesData("Raj",45000,"CS");
       EmployeesData emp3=new EmployeesData("Manu",60000,"operation");

       employeeslist.add(emp1);
       employeeslist.add(emp2);
       employeeslist.add(emp3);
        for (EmployeesData var:employeeslist) System.out.println("name of employe " + var.Name+ "salary of employee" + var.Salary+"dept of employee"+var.Dept);}
    public static void main(String[] args) {

        Arraylistwithemployeesclass obj=new Arraylistwithemployeesclass();
        obj.EmployeedetailsO();


    }
}
