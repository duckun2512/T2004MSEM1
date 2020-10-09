package ss5;

public class ex13 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i<5 ; i++){
            for(int j=1; j<5;j++){
                if(j>i){
                    System.out.println();
                    continue outer;
                }//End of if statement
                System.out.print(j);
            }//End of inner for loop
            System.out.println("\nThis is the outer loop");
        }//End of outer for loop
        System.out.println("Good-Bye");
    }
}
