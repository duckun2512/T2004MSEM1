package Exam.Model;

public class Student {
    private String StudentID;
    private String Name;
    private String Address;
    private String Phone;

    public Student() {
        StudentID = "";
        Name = "";
        Address = "";
        Phone = "";
    }

    public Student(String StudentID, String Name, String Address, String Phone) {
        this.StudentID = StudentID;
        this.Name = Name;
        this.Phone = Phone;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

}
