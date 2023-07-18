package demo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatement {
    public static void main(String[] args) throws SQLException {
        try (
                Connection con = DBContext.getConnection();
                Statement st = con.createStatement();
        ) {
            String sql = "create table Student(" +
                    "id int, " +
                    "name varchar (20), primary key (id));";
            int i = st.executeUpdate(sql);
            System.out.println(i);
        }
    }
}
