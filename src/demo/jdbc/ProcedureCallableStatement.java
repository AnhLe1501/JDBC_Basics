package demo.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProcedureCallableStatement {
    public static void main(String[] args) throws SQLException {
        Connection connection = DBContext.getConnection();

        CallableStatement callableStatement = connection.prepareCall("{call findStudent(?)}");
        callableStatement.setInt(1, 3);
        ResultSet rs = callableStatement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " " + rs.getString("name"));
        }
    }
}
