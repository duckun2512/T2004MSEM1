package lab3;

public class ex6 {
    public  void addNumber ( int...num){
        int sum = 0;

        for (int i:num){
            sum = sum +i;
        }

        System.out.println("Sum of number is : " +sum);
    }

    public static void main(String[] args) {
        ex6 obj =new ex6();

        obj.addNumber(10,30,20,40);
    }
}
