package ss5.ex1;

public class TestBook {
    public static void main(String[] args) {
        Author a1 = new Author("thidk", "dangkimthi@gmail.com", 'F');
        System.out.println(a1);

        Book dummyBook = new Book("Java for Dummy", a1, 19.95, 99);
        System.out.println(dummyBook);

        //Test
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("Name is: " + dummyBook.getName());
        System.out.println("Price is: " + dummyBook.getPrice());
        System.out.println("Qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        //Use an anonymous instances of Author to construct a Book instance
        Book anotherBook = new Book("More Java", new Author("Ma", "Ma20@gmail.com", 'M'), 29.95);
        System.out.println(anotherBook);
    }
}
