package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class AWSConnectionMaker implements ConnectionMaker{
    @Override
    public Connection mekeConnection() throws ClassNotFoundException, SQLException {

        //클래스를 찾는다.
        Class.forName("com.mysql.cj.jdbc.Driver");
        //db에 연결
        Map<String, String> env = System.getenv();
        Connection c = DriverManager.getConnection(env.get("DB_HOST"), env.get("DB_USER"), env.get("DB_PASSWORD"));
        return c;


    }
}
