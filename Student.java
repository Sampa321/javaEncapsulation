package MiniProject.Encapsulation.StudentManagementAppliocation;

import java.util.Scanner;

public class Student {
    private String studentName;
    public int studentRollNo;
    private String departmentName;
    private String address;
    private float marks;
    static int constValue =0;


    Scanner sc=new Scanner(System.in);

    public Student(String Name, String deptName, String Address, float mark){

        //for student Name:
        while (true){
            this.setStudentName(Name);
            if(Name == null || Name.trim().isEmpty())
            {
                System.out.print("please,enter the correct student name:");
                Name = sc.nextLine();
            }
            else {
                break;
            }
       }

        //for student address
        while (true){
            this.setAddress(Address);
            if(Address == null || Address.trim().isEmpty())
            {
                System.out.println("please enter the address:");
                Address = sc.nextLine();
            }
            else {
                break;
            }
        }

      //for student department
        while(true){
            this.setDepartmentName(deptName);
            if(deptName == null || deptName.trim().isEmpty())
            {
                System.out.println("Enter the correct department name:");
                deptName = sc.nextLine();
            }
            else {
               break;
            }
        }

       //for student marks
        while (true){

            this.setMarks(mark);
            if(mark<0)
            {
                System.out.print("Enter the correct marks greater then 0:");
                mark = sc.nextFloat();
            }
            else {
                break;
            }
        }

        StudentManagement.stuNumber++;
        this.studentRollNo = constValue + StudentManagement.stuNumber;
    }


    public String getStudentName() {
        return studentName;
    }

    //set student name
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    //set student address
    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    //set student department name
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public float getMarks() {
        return marks;
    }

    //set student marks

    public void setMarks(float marks) {
        this.marks = marks;
    }
}