package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AwsConnectionMaker implements ConnectionMaker{
    @Override
    public Connection makeConnection() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/likelion-db",
                "root",
                "190846");
        return c;
    }
}
