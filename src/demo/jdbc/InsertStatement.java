package demo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {
    public static void main(String[] args) throws SQLException {
        try (
                Connection con = DBContext.getConnection();
                Statement st = con.createStatement();
                ) {
            String sqlInsert = "insert into student(id, name) values(4, 'D');";
            int numberRowsAffected = st.executeUpdate(sqlInsert);
            System.out.println("Affected rows after inserted: " + numberRowsAffected);
        }
    }
}
