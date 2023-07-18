package demo.jdbc;

import java.sql.*;

public class SelectPrepareStatement {
    public static void main(String[] args) {
        Connection connection = DBContext.getConnection();
        String sql = "select * from student where id = ? and name = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, 3);
            preparedStatement.setString (2, "C" );
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
