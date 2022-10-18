package com.dao;

import com.domain.User;

import java.sql.*;

public class UserDao {

        ConnectionMaker connectionMaker;
    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }


    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection c = connectionMaker.mekeConnection();
        // 명령문을 대입한다. (executeUpdate 해야한다.)
        PreparedStatement ps = c.prepareStatement("insert into users(id, name, password) values(?, ?, ?)");
        // 명령문 values 자리에 값 대입
        ps.setString(1,user.getId());
        ps.setString(2,user.getName());
        ps.setString(3,user.getPassword());
        //대입된 명령문 실행
        ps.executeUpdate();
        //전부 닫아준다.
        ps.close();
        c.close();
    }

    public User select(String id) throws ClassNotFoundException, SQLException {
        Connection c = connectionMaker.mekeConnection();
        // 명령문을 대입한다. (executeUpdate 해야한다.)
        PreparedStatement ps = c.prepareStatement(
                "select * from users where id = ?"
        );
        ps.setString(1, id);

        //명령문을 실행하기위해 엔터를 누른것과 같다.
        ps.execute();

        ResultSet rs = ps.executeQuery();
        rs.next();


        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        return user;
    }
}
