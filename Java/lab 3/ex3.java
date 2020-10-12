package lab3;

public class ex3 {
    public void setVal(int num1){
        num1 = num1 +10;
    }

    public static void main(String[] args) {
        int num1 = 10;

        ex3 obj=new ex3();

        obj.setVal(num1);

        System.out.println("Vaalue of num1 after invoking setVal is: "+num1);
    }
}
