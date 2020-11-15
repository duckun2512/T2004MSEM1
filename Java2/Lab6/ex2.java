package lab6;

import java.sql.*;

public class ex2 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/nowind",
                        "root", "");

                Statement stmt = conn.createStatement();

        ) {
            //1. CategoryName
            String strUpdate = "UPDATE categories SET CategoryName = 'SeaFood VN' WHERE CategoryID = 8";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "SELECT * FROM categories ";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                System.out.println(rset.getInt("CategoryID") + ", "
                        + rset.getString("CategoryName") + ", "
                        + rset.getString("Description"));
            }

            //2. Update Customer
            String strUpdate1 = "UPDATE customers SET Address = '1A Yet Kieu - Ha Noi' WHERE CustomerID = 'FRANK'";
            System.out.println("The SQL statement is: " + strUpdate1 + "\n");
            int countUpdated1 = stmt.executeUpdate(strUpdate1);
            System.out.println(countUpdated1 + " records affected.\n");

            String strSelect1 = "SELECT * FROM customers WHERE CustomerID = 'FRANK' ";
            System.out.println("The SQL statement is: " + strSelect1 + "\n");
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            while (rset1.next()) {
                System.out.println(rset1.getString("CustomerID") + ", "
                        + rset1.getString("CompanyName") + ", "
                        + rset1.getString("Address"));
            }

            //3. Update Products
            String strUpdate2 = "UPDATE products SET UnitPrice = UnitPrice + (UnitPrice/10) WHERE CategoryID = 5 OR CategoryID = 7 or CategoryID = 8";
            System.out.println("The SQL statement is: " + strUpdate2 + "\n");
            int countUpdated2 = stmt.executeUpdate(strUpdate2);
            System.out.println(countUpdated2 + " records affected.\n");

            String strSelect2 = "SELECT * FROM products WHERE CategoryID = 5 OR CategoryID = 7 OR CategoryID = 8 ";
            System.out.println("The SQL statement is: " + strSelect2 + "\n");
            ResultSet rset2 = stmt.executeQuery(strSelect2);
            while (rset2.next()) {
                System.out.println(rset2.getString("CategoryID") + ", "
                        + rset2.getString("ProductName") + ", "
                        + rset2.getString("UnitPrice"));
            }

            //4. Update Orders
            String strUpdate3 = "UPDATE orders SET ShipVia = 3 WHERE OrderID = 10313";
            System.out.println("The SQL statement is: " + strUpdate3 + "\n");
            int countUpdated3 = stmt.executeUpdate(strUpdate3);
            System.out.println(countUpdated3 + " records affected.\n");

            String strSelect3 = "SELECT * FROM orders WHERE OrderID = 10313 ";
            System.out.println("The SQL statement is: " + strSelect3 + "\n");
            ResultSet rset3 = stmt.executeQuery(strSelect3);
            while (rset3.next()) {
                System.out.println(rset3.getString("OrderID") + ", "
                        + rset3.getString("ShipName") + ", "
                        + rset3.getString("ShipVia"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
