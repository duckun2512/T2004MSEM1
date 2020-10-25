package h;

import java.util.Scanner;

public class TestMark {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        Marks objMark = new Marks();
        System.out.println("Welcome to Semester 1");
        do {
            System.out.println("Select the operation you want to perform:");
            System.out.println("************************************************");
            System.out.println("1. Add subjects and marks to the students.");
            System.out.println("2. Search marks of a subject of the students.");
            System.out.println("3. Display Marks details.");
            System.out.println("4. Exit the program.");
            System.out.println("************************************************");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    objMark.addMarks();
                    objMark.checkMarkInput();
                    break;
                case 2:
                    objMark.searchMarks();
                    break;
                case 3:
                    objMark.displayMarks();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("You input wrong operation number, please try again!!!");
            }
            System.out.println();
        } while (choice != 4);
    }
}
