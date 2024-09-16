package in.stackroute;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employees> employees = new ArrayList<>();
        EmployeeFilter ef = new EmployeeFilter();

        Employees e1 = new Employees(101,"srikanth",1);
        Employees e2 = new Employees(102,"Karthick",2);
        Employees e3 = new Employees(103,"Raghuram",3);
        Employees e4 = new Employees(104,"Raadhika",4);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        EmployeeFilter.getEmployeeDetails(employees,1);
        EmployeeFilter.getEmployeeDetails(employees,103);
        EmployeeFilter.getEmployeeDetails(employees,105);
    }
}