package h;

import java.util.Scanner;

public class Book {
    private int[] isbn;

    public Book() {
        isbn = new int[5];
    }

    public void setIsbn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five ISBN numbers:");
        for (int i = 0; i < 5; i++) {
            isbn[i] = Integer.parseInt(sc.nextLine());
        }
    }

    public void getIsbn() {
        System.out.printf("The ISBN numbers of the books are:\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(isbn[i]);
        }
    }

    public void sortIsbn() {
        int temp;
        int[] tempIsbn = isbn;
        for (int i = 0; i < 5; i++) {
            for (int k = i + 1; k < 5; k++) {
                if (tempIsbn[i] > tempIsbn[k]) {
                    temp = tempIsbn[k];
                    tempIsbn[k] = tempIsbn[i];
                    tempIsbn[i] = temp;
                }
            }
        }
        System.out.println("The ISBN numbers of the books in ascending order are: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(tempIsbn[i]);
        }
    }
}
