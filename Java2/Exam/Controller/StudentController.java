package Exam.Controller;

import Exam.Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    String url = "jdbc:mysql://127.0.0.1:3306/Exam";
    String username = "root";
    String password = "";

    List<Student> StudentList = new ArrayList<>();

    public List<Student> addStudent() {
        try(
                Connection conn = DriverManager.getConnection(url,username,password);
                Statement stmt = conn.createStatement();
                ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Student ID:");
            String id = input.nextLine();
            System.out.println("Enter Student Name: ");
            String name = input.nextLine();
            System.out.println("Enter Student Address: ");
            String address = input.nextLine();
            System.out.println("Enter Student Phone: ");
            String phone = input.nextLine();
            Student obj = new Student(id, name, address, phone);
            StudentController ctrl = new StudentController();
            StudentList.add(obj);
            System.out.println("Student has been added");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return StudentList;
    }

    public void displayStudent(List<Student> list) {
        try (
             Connection conn = DriverManager.getConnection(url,username,password);
             Statement stmt = conn.createStatement();
        ) {
            System.out.println("---------------------------");
            System.out.println("All the student records in the collection is: ");
            String id = "StudentID";
            String name = "StudentName";
            String address = "Address";
            String phone = "Phone";
            System.out.printf("%-30s%-30s%-30s%-30s\n", id, name, address, phone);
            for (Student studentModel: list) {
                System.out.printf("%-30s%-30s%-30s%-30s\n", studentModel.getStudentID(), studentModel.getName(),
                        studentModel.getAddress(), studentModel.getPhone());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
