package a2;

import java.util.Scanner;

public class Calculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInt = initArray(5);
        for(int i = 0; i < myInt.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myInt[i]);
        }

        System.out.println("The average is " + getAverage(myInt));

        for(int i = myInt.length-1; i >= 0; i--) {
            System.out.println("Element " + i + ", typed value was " + myInt[i]);
        }
    }

    public static int[] initArray(int size) {
        System.out.println("Enter " + size + " integer values.\r");
        int[] values = new int[size];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
