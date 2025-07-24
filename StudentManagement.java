package MiniProject.Encapsulation.StudentManagementAppliocation;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    static int stuNumber;
    static{
        System.out.println("welcome for student management application! 🙂");
        stuNumber=0;
    }

    static ArrayList<Student> allStudentRecords = new ArrayList<>();

    public static void main(String[] args) {
        while(true){
            Scanner obj = new Scanner(System.in);
            System.out.println("----------------------Option------------------------");
            System.out.println("1.Add Student");
            System.out.println("2.Show all student");
            System.out.println("3.get Student information based on roll number:");
            System.out.println("4.Delete Student");
            System.out.println("5.Update Student");
            System.out.println("6.Exit");
            System.out.print("Enter the input:");
            int input = obj.nextInt();
            obj.nextLine();

            switch (input) {
                case 1:
                    System.out.print("Enter the student name:");
                    String stuName = obj.nextLine();

//                    System.out.print("Enter the student roll no:");
//                    int stuRollNo=obj.nextInt();
//                    obj.nextLine();

                    System.out.print("Student Department Name:");
                    String stuDeptName = obj.nextLine();

                    System.out.print("Student Address:");
                    String stuAdd = obj.nextLine();

                    System.out.print("Student marks:");
                    float stuMark = obj.nextFloat();

                    obj.nextLine();
                    Student s1 = new Student(stuName,stuDeptName, stuAdd, stuMark);
                    allStudentRecords.add(s1);
                    System.out.println("Student insert successfully");
                    break;
                case 2:

                    if (allStudentRecords.isEmpty()) {
                        System.out.println("First insert student!");
                    } else {
                        System.out.println("-----------all Student Information--------------");

                        for (Student stu : allStudentRecords) {
                            System.out.println("Name :" + stu.getStudentName());
                            System.out.println("Roll No :" + stu.studentRollNo);
                            System.out.println("Department name :" + stu.getDepartmentName());
                            System.out.println("Address :" + stu.getAddress());
                            System.out.println("Marks :" + stu.getMarks());
                            System.out.println("=================================================");
                        }
                    }
                    break;
                case 3:
                    if (allStudentRecords.isEmpty()) {
                        System.out.println("First insert student!");
                    } else {
                        System.out.println("-------------------Student information---------------");
                        System.out.print("Enter the student Roll No:");
                        int stuRno = obj.nextInt();
                        boolean studentFound = false;
                        for (Student s : allStudentRecords) {
                            if(s.studentRollNo == stuRno) {
                                System.out.println("Name :" + s.getStudentName());
                                System.out.println("Roll No :" + s.studentRollNo);
                                System.out.println("Department name :" + s.getDepartmentName());
                                System.out.println("Address :" + s.getAddress());
                                System.out.println("Marks :" + s.getMarks());
                                studentFound = true;
                                break;
                            }
                        }
                        if(!studentFound)
                        {
                            System.out.println("Enter the correct roll number for student information!");
                        }
                    }
                    break;
                case 4:
                    if (allStudentRecords.isEmpty()) {
                        System.out.println("First insert student!");
                    } else {
                        System.out.print("Enter the student roll number of student to delete:");
                        int dltRollNo = obj.nextInt();
                        boolean studentFound = false;
                        for (Student stu : allStudentRecords) {
                            if (stu.studentRollNo == dltRollNo) {
                                allStudentRecords.remove((stu));
                                System.out.println("delete student successfully!😊");
                                studentFound = true;
                                break;
                            }
                        }
                        if (!studentFound) {
                            System.out.println("please enter the correct roll no!😶");
                            break;
                        }
                    }
                    break;
                case 5:
                    if (allStudentRecords.isEmpty()) {
                        System.out.println("First insert student!");
                    } else {
                        System.out.print("Enter the roll number of student to update:");
                        int updateStudentRollNo = obj.nextInt();
                        Student studentUpdate = null;
                        for (Student st : allStudentRecords) {
                            if(st.studentRollNo == updateStudentRollNo)
                            {
                                studentUpdate = st;
                                break;
                            }
                        }
                        if(studentUpdate != null)
                        {
                            System.out.println("----------------please choice which information you want to update----------------");
                            System.out.println("1.Name\n2.Roll No\n3.Department Name\n4.Address\n5.marks");
                            System.out.print("Enter the update option:");
                            int updateOption = obj.nextInt();
                            obj.nextLine();
                            switch(updateOption)
                            {
                                case 1:
                                    System.out.print("Enter the student name:");
                                    String newStudentName = obj.nextLine();
                                    studentUpdate.setStudentName(newStudentName);
                                    System.out.println("student update successfully");
                                    break;
                                case 2:
                                    System.out.print("Student Roll No:");
                                    int newStudentRollNo = obj.nextInt();
                                    obj.nextLine();
                                    studentUpdate.studentRollNo = newStudentRollNo;
                                    System.out.println("student update successfully🙂");
                                    break;
                                case 3:
                                    System.out.print("Student Department Name:");
                                    String newStudentCollegeName = obj.nextLine();
                                    studentUpdate.setDepartmentName(newStudentCollegeName);
                                    System.out.println("student update successfully🙂");
                                    break;
                                case 4:
                                    System.out.print("Student Address:");
                                    String newStudentAdd = obj.nextLine();
                                    studentUpdate.setAddress(newStudentAdd);
                                    System.out.println("student update successfully🙂");
                                    break;
                                case 5:
                                    System.out.print("Student marks:");
                                    float newStudentMark = obj.nextFloat();
                                    studentUpdate.setMarks(newStudentMark);
                                    System.out.println("student update successfully🙂");
                                    break;
                                default:
                                    System.out.println("Enter the valid input!");
                            }
                        }
                        else {
                            System.out.println("please enter the correct roll no of student to update!");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using student management application! 🎉");
                    obj.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("sorry,enter the correct input!😢");
                }
            }
        }
    }

