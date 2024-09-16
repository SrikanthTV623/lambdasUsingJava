package in.stackroute;

import java.util.List;

public class EmployeeFilter {
    public static void getEmployeeDetails(List<Employees> employees, int searchid){
        for(Employees e : employees){
            if(e.getEmp_id()==searchid || e.getDept_id() == searchid){
                e.print();
            }
        }
    }
}
