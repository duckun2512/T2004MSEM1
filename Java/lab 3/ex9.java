package lab3;

public class ex9 {
    int empID;
    String empName;

    private  String SSN;
    protected  String empDesig;

    public VD10(int ID, String Name){
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
        ex9 objEmp1 = new ex9(1300,"Clara Smith");

        objEmp1.empDesig="Reception";
        objEmp1.SSN="282-72-3873";

        objEmp1.display();
    }
}
