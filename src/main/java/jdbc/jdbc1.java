package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest","root","Root");
        Statement stmt =con.createStatement();
        String s = "insert into employee values(4,'rima','subedi','r@gmai.com')";
        stmt.executeUpdate(s);

        con.close();
        System.out.println("program complited");

    }
}
