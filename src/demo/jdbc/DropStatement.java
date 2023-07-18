package demo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DropStatement {
    public static void main(String[] args) throws SQLException {
        try (
                Connection con = DBContext.getConnection();
                Statement st = con.createStatement();
        ) {
            String sql = "Drop table Student";
            int i = st.executeUpdate(sql);
            System.out.println(i);
        }
    }
}
