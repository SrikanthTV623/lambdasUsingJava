package in.stackroute;

public class Employees {
    private int emp_id;
    private String emp_name;
    private int dept_id;

    public Employees(int emp_id, String emp_name, int dept_id) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.dept_id = dept_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public void print(){
        System.out.println("Employee id:"+emp_id+"Employee Name:"+emp_name+"Department id:"+dept_id);
    }

    @Override
    public String toString() {
        return "employees{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", dept_id=" + dept_id +
                '}';
    }
}
