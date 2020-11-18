package Exam.View;

import Exam.Controller.StudentController;
import Exam.Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    StudentController student = new StudentController();
    List<Student> studentList = new ArrayList<>();
    public void main(String[] args) {
        System.out.println("Student List");
        System.out.println("====================================");
    }

    public void menu(String[] args) {
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
                    student.displayStudent();
                    break;
                case 3:
                    save();
                case 4:
                    System.out.println("Exit...");
            }
        } while (choice != 4);
    }

    public void save() {
        Iterator<Student> studentIterator = studentList.iterator();
        while (studentIterator.hasNext()) {
            Student st = studentIterator.next();
            student.addStudent();
        } student.addStudent();
    }

}
