package Exam.View;

import Exam.Controller.StudentController;
import Exam.Model.Student;

import javax.swing.text.View;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    StudentController student = new StudentController();
    List<Student> studentList = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Student List");
        System.out.println("====================================");
        Main s1 = new Main();
        s1.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add student records\n"
            + "2. Display student records\n"
            + "3. Save\n"
            + "4. Exit");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentList = student.addStudent();
                    break;
                case 2:
                    student.displayStudent(studentList);
                    break;
                case 3:
                    save();
                case 4:
                    System.out.println("Exit...");
            }
        } while (choice != 4);
    }

    public void save() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Exam","root","");
                Statement stmt = conn.createStatement();
                ) {
            conn.setAutoCommit(false);
            conn.commit();
            int checkUpdate = 0;
            for (Student student: studentList) {
                String strUpdate = "insert into Student values ('" + student.getStudentID() + "', '" +
                        student.getName() + "', '" + student.getAddress() + "', '" +
                        student.getPhone() + "')";
                System.out.println("The SQL Insert Statement is: " + strUpdate);
                if (stmt.executeUpdate(strUpdate) > 0) checkUpdate++;
            }
            conn.commit();

            System.out.println("Total " + checkUpdate + " records are saved");

            System.out.println("Check inserted records:");
            String strSelect = "select * from student";
            ResultSet rs = stmt.executeQuery(strSelect);
            ResultSetMetaData rsMD = rs.getMetaData();

            int numCols = rsMD.getColumnCount();
            for (int i=1; i<=numCols; i++) {
                System.out.printf("%-30s", rsMD.getColumnName(i));
            }
            System.out.println();

            while (rs.next()) {
                for (int i=1; i<=numCols; i++) {
                    System.out.printf("%-30s", rs.getString(i));
                }
                System.out.println();
            }

            conn.close();
            if (conn.isClosed()) {
                System.out.println("Connection closed.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
