package MiniProject.Encapsulation.EmplyeeManagementApplication;


import java.util.Scanner;

public class Employee {
    private String employeeName;
    public int empID;
    private String department;
    private int salary;

    Employee(String empName, String dept, int sal) {
        EmployeeManagement.totalEmployees++;
        Scanner sc = new Scanner(System.in);
        // set employee name
        while (true){
            this.setEmployeeName(empName);
            if(empName == null || empName.trim().isEmpty()) {
                System.out.println("please enter the employee name again:");

                empName = sc.nextLine();
            } else {
                break;
            }
        }

        // set employee id
        this.empID = EmployeeManagement.constantValue + EmployeeManagement.totalEmployees;

        // set department
        while (true){
            this.setDepartment(dept);
            if(dept == null || dept.trim().isEmpty())
            {
                System.out.println("Please enter the correct department name again : ");
                dept=sc.nextLine();
            }
            else {
                break;
            }
        }

        // set salary
        while (true){
            this.setSalary(sal);
            if(sal<0)
            {
                System.out.print("Enter the correct marks and marks>=0 : ");
                sal=sc.nextInt();
            }
            else
                break;
        }

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
            this.salary = salary;
    }
}
