package lab3;

import java.sql.*;

public class CheckCustomer {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind","root","");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select CompanyName from customers";
            System.out.println("companyName: " + strSelect);

            ResultSet rset = stmt.executeQuery(strSelect);
            int rowCount = 0;
            while (rset.next()){
                String CompanyName = rset.getString("CompanyName");
                System.out.println(CompanyName);
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

}
