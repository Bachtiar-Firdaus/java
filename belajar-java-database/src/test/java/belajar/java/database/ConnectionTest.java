package belajar.java.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    @BeforeAll
    static void beforeAll(){
        try {
            Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    @Test
    void testConnection(){
        String jdbcUrl = "jdbc:mysql://localhost:3306/belajar_java_database";
        String username = "root";
        String password = "root";

        try {
            System.out.println("======Mysql Connecting=======");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("======Mysql Success Connected=======");
        }catch (SQLException exception){
            Assertions.fail(exception);
        }
    }
    @Test
    void testConnectionClose(){
        String jdbcUrl = "jdbc:mysql://localhost:3306/belajar_java_database";
        String username = "root";
        String password = "root";

        try {
            System.out.println("======Mysql Connecting=======");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("======Mysql Success Connected=======");
            connection.close();
            System.out.println("======Mysql Connection Closed=======");
        }catch (SQLException exception){
            Assertions.fail(exception);
        }
    }
    @Test
    void testConnectionAutoCloseble(){
        String jdbcUrl = "jdbc:mysql://localhost:3306/belajar_java_database";
        String username = "root";
        String password = "root";

        System.out.println("======Mysql Connecting=======");
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)){
            System.out.println("======Mysql Success Connected=======");
        }catch (SQLException exception){
            Assertions.fail(exception);
        }
    }
}
