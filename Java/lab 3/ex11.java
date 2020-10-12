package lab3;

public class ex11 {
    int rollNo;
    String Name;
    String Address;
    float marks;

    public ex11(){
        rollNo = 0;
        Name="";
        Address="";
        marks=0;
    }

    public ex11(int rNo,String sname){
        rollNo=rNo;
        Name=sname;
    }

    public ex11(int rNo,float score){
        rollNo=rNo;
        marks=score;
    }

    public ex11(String sname, String addr){
        Name=sname;
        Address=addr;
    }

    public ex11(int rNo, String sname, float score){
        rollNo=rNo;
        Name=sname;
        marks=score;
    }

    public void displayDetail(){
        System.out.println("Rollno"+rollNo);
        System.out.println("Student Name"+Name);
        System.out.println("Address "+Address);
        System.out.println("Score"+marks);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        ex11 objSutID = new ex11("David","302,Washington Street");
        objSutID.displayDetail();

        ex11 objStuID2 = new ex11(103,46);
        objStuID2.displayDetail();

        ex11 objStuID3 = new ex11(104,"Roger",50);
        objStuID3.displayDetail();
    }

}
