package ex4;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int i, String f, String l, int s) {
        id = i;
        firstName = f;
        lastName = l;
        salary = s;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return "firstName " + firstName + " lastName " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int s) {
        this.salary = s;
    }

    public int getAnnualSalary() {
        return salary*12;
    }

    public int raiseSalary(int percent) {
        this.salary = salary+salary*percent;
        return this.salary;
    }

    public String toString() {
        return "Employee[id=" + id + " name=" + firstName + lastName + " salary=" + salary + "]";
    }
}
