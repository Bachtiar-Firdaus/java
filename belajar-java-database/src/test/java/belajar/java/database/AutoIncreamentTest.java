package belajar.java.database;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class AutoIncreamentTest {
    @Test
    void testAutoIncrement() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        String sql = "INSERT INTO comments(email, comment) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);


        preparedStatement.setString(1,"daus@example.com");
        preparedStatement.setString(2,"hi");

        preparedStatement.executeUpdate();
        ResultSet resultSet = preparedStatement.getGeneratedKeys();

        if(resultSet.next()){
            System.out.println("Id Comment : "+ resultSet.getInt(1));
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
