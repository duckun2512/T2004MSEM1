package ss5;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        int cnt, number;
        for(cnt = 1, number = 0; cnt <= 10; cnt++){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            number = input.nextInt();
            if(number == 0){
                break;
            }//End if statement
        }//End of for statement
    }
}
