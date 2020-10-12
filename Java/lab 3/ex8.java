package lab3;

public class ex8 {
    int empID;
    String empName;

    private  String SSN;
    protected  String empDesig;

    public VD9(int ID, String Name){
        empID = ID;
        empName= Name;
    }

    public String getSSN(){
        return SSN;
    }

    public void setSSN(String ssn){
        SSN = ssn;
    }

    public void setDesignation(String desig){
        empDesig = desig;
    }

    public void display(){
        System.out.println("Employee ID is "+empID);
        System.out.println("Employee Name is "+empName);
        System.out.println("Designation is "+empDesig);
        System.out.println("SSN is "+SSN);
    }

    public static void main(String[] args) {
        ex8 objEmp1 = new ex8(1200,"Roger Steven");

        objEmp1.empDesig="Manager";
        objEmp1.SSN="281-72-3873";

        objEmp1.display();
    }
}
