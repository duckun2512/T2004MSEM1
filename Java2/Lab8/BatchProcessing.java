package lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {
    public static void main(String[] args) {
        try {
            // Step 1: Allocate a database 'Connection' obj
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.3:3306/database","root","");

            // Step 2: Allocate a 'Statement' obj in the Connection

            Statement stmt = conn.createStatement();

            // Step 3 & 4: Execute queries and process the query results
            conn.setAutoCommit(false);

            stmt.addBatch("insert into books values (8001, 'Java ABC', 'Kevin Jones', 1.1, 99)");
            stmt.addBatch("insert into books values (8002, 'Java XYZ', 'Kevin Jones', 1.1, 99)");
            stmt.addBatch("update books set price = 11.11 where id = 8001 or id = 8002");
            int[] returnCodes = stmt.executeBatch();

            System.out.print("Return codes are: ");
            for (int code: returnCodes) {
                System.out.printf(code + ", ");
            }

            conn.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
