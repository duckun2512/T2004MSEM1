package Exam.Controller;

import Exam.Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    String url = "jdbc:mysql://192.168.64.3:3306/Exam";
    String username = "root";
    String password = "";

    List<Student> StudentList = new ArrayList<>();

    public List<Student> loading() {
        try (
                Connection conn = DriverManager.getConnection(url,username,password);
                Statement stmt = conn.createStatement();
        )    {
            String select = "Select * from Student";
            ResultSet rset = stmt.executeQuery(select);

            while (rset.next()) {
                String id = rset.getString("StudentID");
                String name = rset.getString("Name");
                String address = rset.getString("Address");
                String phone = rset.getString("Phone");

                Student obj = new Student(id, name, address, phone);
                StudentList.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return StudentList;
    }

    public List<Student> addStudent() {
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
        return StudentList;
    }

    public void displayStudent() {
        try (
             Connection conn = DriverManager.getConnection(url,username,password);
             Statement stmt = conn.createStatement();
        ) {
            String st = "Select * from Student";
            ResultSet rset = stmt.executeQuery(st);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; i++) {
                System.out.printf("%-20s",rset.getString(i));
            }
            loading();
            System.out.println();

            while (rset.next()) {
                for (int i = 1; i <= numColumns; i++) {
                    System.out.printf("%-20s",rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
