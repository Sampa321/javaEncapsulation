package MiniProject.Encapsulation.EmplyeeManagementApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    static int constantValue;
    static int totalEmployees;
    static ArrayList<Employee> allEmployeeRecords = new ArrayList<>();

    static {
        System.out.println("=========== Welcome to b3-dsa employee management system ================");
        constantValue = 1530;
        totalEmployees = 0;
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("---------------------------------------------");
            System.out.println("Choose what you want to perform in the system.");
            System.out.println("1 - Add new employee");
            System.out.println("2 - Search an employee.");
            System.out.println("3 - Get list of all employees in the system.");
            System.out.println("4 - Delete employee.");
            System.out.println("5 - update employee.");
            System.out.println("6 - EXIT");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your option : ");
            int option = sc.nextInt();
            sc.nextLine();
            switch(option) {
                case 1: //add employee
                    System.out.print("Enter name of new employee : ");
                    String name = sc.nextLine();

                    System.out.print("Enter department of employee : ");
                    String dept = sc.nextLine();

                    System.out.print("Enter salary of employee : ");
                    int sal = sc.nextInt();
                    sc.nextLine();
                    Employee e1 = new Employee(name, dept, sal);

                    allEmployeeRecords.add(e1);

                    System.out.println("Employee insert successfully!");
                    break;
                case 2: //search employee
                    if(allEmployeeRecords.isEmpty() )
                    {
                        System.out.println("first add employee!");
                    }
                    else {
                        System.out.print("Enter the employee Id:");
                        int empId = sc.nextInt();
                        boolean EmployeeFound=false;
                        for(Employee emp:allEmployeeRecords) {
                            if(empId == emp.empID) {
                                System.out.println("Employee Name : " + emp.getEmployeeName());
                                System.out.println("Employee ID : " + emp.empID);
                                System.out.println("Department : " + emp.getDepartment());
                                System.out.println("🤑 : " + emp.getSalary() + " / year ");
                                EmployeeFound = true;
                                break;
                            }
                        }
                        if(!EmployeeFound)
                        {
                            System.out.println("Please enter the correct employee id!");
                        }
                    }
                    break;
                case 3: //all employee
                    if(allEmployeeRecords.isEmpty() )
                    {
                        System.out.println("first add employee!");
                    }
                    else {
                        System.out.println("The following list contains details of all employees in B3-DSA employee management System.");
                        for (Employee majdoor : allEmployeeRecords) {
                            System.out.println("============================");
                            System.out.println("Employee Name : " + majdoor.getEmployeeName());
                            System.out.println("Employee ID : " + majdoor.empID);
                            System.out.println("Department : " + majdoor.getDepartment());
                            System.out.println("🤑 : " + majdoor.getSalary() + " / year ");
                            System.out.println("============================");
                        }
                    }
                    break;
                case 4:    //Delete employee
                    if(allEmployeeRecords.isEmpty())
                    {
                        System.out.println("First insert employee");
                    }
                    else {
                        System.out.print("Enter the employee id which information you want to deleted: ");
                        int deleteEmployeeId=sc.nextInt();
                            boolean deleteEmployee = false;
                            for(Employee emp:allEmployeeRecords)
                            {
                                if(emp.empID==deleteEmployeeId)
                                {
                                    allEmployeeRecords.remove(emp);
                                    deleteEmployee =true;
                                    System.out.println("Successfully employee deleted!");
                                    break;
                                }
                            }
                            if(!deleteEmployee)
                            {
                                System.out.println("Enter the correct employee id :");
                            }
                        }
                        break;
                case 5: //update employee information
                    if(allEmployeeRecords.isEmpty())
                    {
                        System.out.println("First insert employee");
                    }
                    else {
                        System.out.print("Enter the employee id which information update:");
                        int updateEmployeeId=sc.nextInt();
                        Employee updateEmployee =null;
                        for(Employee emp:allEmployeeRecords)
                        {
                            if(emp.empID == updateEmployeeId)
                            {
                                updateEmployee = emp;
                            }
                        }
                        if(updateEmployee != null)
                        {
                            System.out.println("-----------------option------------------");
                            System.out.println("1.Employee name\n" + "2.Employee id \n"+"3.Employee Department\n"+"4.Employee salary");
                            System.out.print("Enter the choose option which information you can update:");
                            int updateOption=sc.nextInt();
                            sc.nextLine();
                            switch (updateOption){
                                case 1:
                                    System.out.print("Enter the employee update name : ");
                                    String updateEmployeeName=sc.nextLine();
                                    updateEmployee.setEmployeeName(updateEmployeeName);
                                    System.out.println("Successfully update!");
                                    break;
                                case 2:
                                    System.out.print("Enter the employee update id : ");
                                    int updateId=sc.nextInt();
                                    updateEmployee.empID = updateId;
                                    System.out.println("Successfully update!");
                                    break;
                                case 3:
                                    System.out.print("Enter the employee update department:");
                                    String updateDepartment=sc.nextLine();
                                    updateEmployee.setDepartment(updateDepartment);
                                    System.out.println("Successfully update!");
                                    break;
                                case 4:
                                    System.out.print("Enter the update salary : ");
                                    int updateSalary=sc.nextInt();
                                    updateEmployee.setSalary(updateSalary);
                                    System.out.println("Successfully update!");
                                    break;
                            }
                        }
                        else {
                            System.out.println("Enter the correct employee id!");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exiting system. Thank you for using B3-DSA employee management System.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Theek kore option choose kor!");
            }
        }
    }
}
