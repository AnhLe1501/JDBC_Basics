package demo.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatement {
    public static void main(String[] args) throws SQLException {
        try (
                Connection con = DBContext.getConnection();
                Statement st = con.createStatement();
        ) {
            final String sql = "select name from student where id = 2";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("name");
                System.out.println(name);
            }
        }
    }
}
