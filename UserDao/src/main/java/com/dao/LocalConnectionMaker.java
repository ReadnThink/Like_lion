package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocalConnectionMaker implements ConnectionMaker{
    @Override
    public Connection mekeConnection() throws ClassNotFoundException, SQLException {

        //클래스를 찾는다.
        Class.forName("com.mysql.cj.jdbc.Driver");
        //db에 연결
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost/likelion-db",
                "root",
                "190846");

        return c;
    }
}
