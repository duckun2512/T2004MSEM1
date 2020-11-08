package lab5;

import java.sql.*;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try {
            //Step 1: Allocate a database 'Connection' object
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ebookshop","root","");

            //Step 2: Allocate a 'Statement' object in the Connection
            Statement stmt = conn.createStatement();
            {
                //Step 3 & 4: Execute a SQL INSERT|DELETE statement via executeUpdate(),
                // which returns an int indicating the number of rows affected.

                // DELETE records with ID > 8000
                String sqlDelete = "delete from books where id > 8000";
                System.out.println("The SQL statement is: " + sqlDelete + "\n"); // Echo for debugging
                int countDeleted = stmt.executeUpdate(sqlDelete);
                System.out.println(countDeleted + " records deleted.\n");

                // INSERT multiple records
                String sqlInsert = "Insert into books values "
                        + "(8001, 'Java Core', 'Dang Kim Thi', 15.55, 55),"
                        + "(8002, 'Java Advanced', 'James Goshling', 25.5, 55)";
                System.out.println("The SQL statement is: " + sqlInsert + "\n");
                int countInserted = stmt.executeUpdate(sqlInsert);
                System.out.println(countInserted + " records inserted.\n");

                // INSERT a partial record
                sqlInsert = "Insert into books (id, title, author) values (2001, 'Java JDBC MySQL', 'ThiDK')";
                System.out.println("The SQL statement is: " + sqlInsert + "\n");
                countInserted = stmt.executeUpdate(sqlInsert);
                System.out.println(countInserted + " records inserted.\n");

                // Delete a book with prompt
                Scanner input = new Scanner(System.in);
                int id = input.nextInt();
                sqlDelete = "delete from books where id = " + id;
                System.out.println("The SQL statement is: " + sqlDelete);
                countDeleted = stmt.executeUpdate(sqlDelete);
                System.out.println(countDeleted + " row effected");
                System.out.println("==========================================");
                System.out.println("Enter Information of the book you want to add:\n" + "BookID: ");
                id = input.nextInt();
                System.out.println("Title: ");
                String title = input.nextLine();
                System.out.println("Author: ");
                String author = input.nextLine();
                System.out.println("Price: ");
                Double price = input.nextDouble();
                System.out.println("Qty: ");
                int qty = input.nextInt();
                sqlInsert = "Insert into books values " +
                        "(" + id + ", " + title + ", " + author + ", " + price + ", " + qty + ")";
                System.out.println("The SQL statement is: " + sqlInsert);
                countInserted = stmt.executeUpdate(sqlInsert);
                System.out.println(countInserted + "row effected");

                // Issue a SELECT to check the changes
                String strSelect = "select * from books";
                System.out.println("The SQL statement is: " + strSelect + "\n");
                ResultSet rset = stmt.executeQuery(strSelect);

                while (rset.next()) { // Move the cursor to the next row
                    System.out.println(rset.getInt("id") + ", "
                            + rset.getString("author") + ", "
                            + rset.getString("title") + ", "
                            + rset.getDouble("price") + ", "
                            + rset.getInt("qty"));
                }
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        } // Step 5: Close conn and stmt - Done automatically by try-with-resources
    }
}

