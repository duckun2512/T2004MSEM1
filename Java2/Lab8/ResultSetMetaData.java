package lab8;

import java.sql.*;

public class ResultSetMetaData {
    public static void main(String[] args) {
        try {
            // Step 1: Allocate a database 'Connection' obj
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.3:3306/database","root","");

            // Step 2: Allocate a 'Statement' obj in the Connection

            Statement stmt = conn.createStatement();

            // Step 3 & 4: Execute queries and process the query results
            ResultSet rset = stmt.executeQuery("select * from books");
            // Get the metadata of the ResultSet
            java.sql.ResultSetMetaData rsetMD = rset.getMetaData();
            // Get the number of column from metadata
            int numColumns = rsetMD.getColumnCount();

            // Print column names - Column Index begins at 1 (instead of 0)
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();

            // Print column class names
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();

            // Print column contents for all the rows
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    // getString() can be used for all column types
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
