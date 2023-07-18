package demo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrepareStatement {
    public static void insertRecords(int id, String name) {
        Connection connection = DBContext.getConnection();
        String sql = "Insert into Student(id, name) value (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateRecords(int id, String name) {
        Connection connection = DBContext.getConnection();
        String sql = "update student set name = ? where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleteRecords(int id) {
        Connection connection = DBContext.getConnection();
        String sql = "delete from student where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        insertRecords(5,"Nam");
       // updateRecords(5, "Minh");
       // deleteRecords(5);
    }
}
