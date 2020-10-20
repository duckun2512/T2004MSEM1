package ss5.ex1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("thidk", "dangkimthi@gmail.com", 'F');
        System.out.println(a1);
        a1.setEmail("codelean@gmail.com");
        System.out.println("Name is: " + a1.getName());
        System.out.println("Email is: " + a1.getEmail());
        System.out.println("Gender is: " + a1.getGender());
    }
}
