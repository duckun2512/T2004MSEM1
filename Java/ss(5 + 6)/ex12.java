package ss5;

public class ex12 {
    public static void main(String[] args) {
        int i;
        outer:
        for(i=0; i<5; i++){
            if(i==2){
                System.out.println("Hello");
                break outer;
            }
            System.out.println("This in the outer loop.");
        }
        System.out.println("Good-Bye");
    }
}
