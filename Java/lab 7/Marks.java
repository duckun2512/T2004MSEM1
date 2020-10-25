package h;

import java.util.Scanner;

public class Marks {
    private int[][] marks;
    private byte marksCount;


    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }

    public Marks() {
        marks = new int[4][4];
        marksCount = 0;
    }

    public void addMarks() {
        Scanner sc = new Scanner(System.in);
        if (marksCount < marks.length) {
            System.out.print("Enter ID of the subject: ");
            marks[marksCount][0] = Integer.parseInt(sc.nextLine());

            System.out.print("Enter point of the Toan: ");
            marks[marksCount][1] = Integer.parseInt(sc.nextLine());

            System.out.print("Enter point of the An: ");
            marks[marksCount][2] = Integer.parseInt(sc.nextLine());

            System.out.print("Enter point of the Tung: ");
            marks[marksCount][3] = Integer.parseInt(sc.nextLine());

            marksCount++;
        } else System.out.println("Sorry! The number of Students exceeded, you cannot add more marks for students");
    }

    public void displayMarks() {
        if (marksCount > 0) {
            System.out.println(padRight("Subject ID", 15) + padRight("Toan", 15) + padRight("An", 15) + "Tung");

            for (int rowIndex = 0; rowIndex < marksCount; rowIndex++) {
                System.out.println(padRight(Integer.toString(marks[rowIndex][0]), 15) +
                        padRight(Integer.toString(marks[rowIndex][1]), 15) +
                        padRight(Integer.toString(marks[rowIndex][2]), 15) +
                        padRight(Integer.toString(marks[rowIndex][3]), 15));
            }
        } else System.out.println("There is no subject to display ;( Please add more subjects!!");
    }

    public void searchMarks() {
        Scanner sc = new Scanner(System.in);
        boolean marksFound = false;
        if (marksCount > 0) {
            System.out.print("Enter the number of Subject ID you want to seach for: ");
            int searchID = Integer.parseInt(sc.nextLine());
            for (int rowIndex = 0; rowIndex < marksCount; rowIndex++) {
                if (marks[rowIndex][0] == searchID) {
                    System.out.println(padRight("Subject ID", 15) + padRight("Toan", 15) + padRight("An", 15) + "Tung");
                    System.out.println(padRight(Integer.toString(marks[rowIndex][0]), 15) +
                            padRight(Integer.toString(marks[rowIndex][1]), 15) +
                            padRight(Integer.toString(marks[rowIndex][2]), 15) +
                            padRight(Integer.toString(marks[rowIndex][3]), 15));
                    marksFound = true;
                    break;
                }
            }
            if (!marksFound) System.out.println("There is no subject to be found, please try again!!");
        } else System.out.println("There is no subject to display ;( Please add more subjects!!");
    }

    public int getMarks(int index1, int index2) {
        return (index1 < 0 || index2 < 0 || index1 >= marks.length || index2 >= marks[0].length) ? null : marks[index1][index2];
    }

    public void checkMarkInput() {
        String name = "";
        for (int i = 0; i < marksCount; i++) {
            for (int k = 1; k < marks[0].length; k++) {
                if (marks[i][k] > 100 || marks[i][k] < 0) {
                    marks[i][k] = 0;
                    switch (k) {
                        case 1:
                            name = "A";
                            break;
                        case 2:
                            name = "B";
                        case 3:
                            name = "C";
                    }
                    System.out.printf("There is something wrong when inputting point of %s in subject %d, set mark of %s to default.\n", name, marks[i][0], name);
                }
            }
        }
    }
}
