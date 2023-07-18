package demo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionJDBC {
    public static void main(String[] args) throws SQLException {
        Connection connection = DBContext.getConnection();
        Statement statement1 = connection.createStatement();

        connection.setAutoCommit(false);

        String sql1 = "insert into student(id, name) values (1, 'E');"; //cause exception
        String sql2 = "delete from student where id = 4;";

        statement1.executeUpdate(sql2);                                 //delete
        statement1.executeUpdate(sql1);                                 //exception

        connection.commit();                                            //câu lệnh delete không thành công
    }
}
