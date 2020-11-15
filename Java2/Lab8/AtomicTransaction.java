package lab8;

import java.sql.*;

public class AtomicTransaction {
    public static void main(String[] args) {
        System.out.println("aaaaa");
        try {
            // Step 1: Allocate a database 'Connection' obj
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.3:3306/database","root","");

            // Step 2: Allocate a 'Statement' obj in the Connection

            Statement stmt = conn.createStatement();

            // Step 3 & 4: Execute queries and process the query results
            // Disable auto-commit for the connection, which commits every SQL statement.
            conn.setAutoCommit(false);

            // Before changes
            ResultSet rset = stmt.executeQuery("select id, qty from books where id in (1001, 1002)");
            System.out.println("-- Before UPDATE --");
            while (rset.next()) {
                System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
            }
            conn.commit();   // Commit SELECT

            // Issue two UPDATE statements through executeUpdate()
            stmt.executeUpdate("update books set qty = qty + 1 where id = 1001");
            stmt.executeUpdate("update books set qty = qty + 1 where id = 1002");
            conn.commit();   // Commit UPDATEs

            rset = stmt.executeQuery("select id, qty from books where id in (1001, 1002)");
            System.out.println("-- After UPDATE and Commit --");
            while (rset.next()) {
                System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
            }
            conn.commit();   // Commit SELECT

            // Issue two UPDATE statements through executeUpdate()
            stmt.executeUpdate("update books set qty = qty - 99 where id = 1001");
            stmt.executeUpdate("update books set qty = qty - 99 where id = 1002");
            conn.rollback(); // Discard all changes since the last commit

            rset = stmt.executeQuery("select id, qty from books where id in (1001, 1002)");
            System.out.println("-- After UPDATE and Rollback --");
            while (rset.next()) {
                System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
            }
            conn.commit();   // Commit SELECT
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
