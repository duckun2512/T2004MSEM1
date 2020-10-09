package ss5;

public class ex14 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    public static void main(String[] args) {
        ex14 objCustomer1 = new ex14();

        objCustomer1.customerID = 100;
        objCustomer1.customerName="John";
        objCustomer1.customerAddress="123Street";
        objCustomer1.customerAge=30;

        //Dislay
        System.out.println("Customer Identification Number:" +
                objCustomer1.customerID);
        System.out.println("Customer Name: "+objCustomer1.customerName);
        System.out.println("Customer Address: "+objCustomer1.customerAddress);
        System.out.println("Customer Age: "+objCustomer1.customerAge);
    }
}
