package dao;

import domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    ConnectionMaker connectionMaker;

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void jdbcContext(StatementStrategy stmt){
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = connectionMaker.makeConnection();
            ps = stmt.makeStrategy(c);
            ps.executeUpdate();
        } catch (SQLException e) {

        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {

                }
            }
            if(c != null){
                try {
                    c.close();
                } catch (SQLException e) {

                }
            }
        }
    }

    public void deleteAll() throws SQLException {
        jdbcContext(new DeleteAllStrategy());
    }
    public void add(User user) throws SQLException {
        jdbcContext(new AddStrategy(user));
    }

    public int getCount() throws SQLException {
        Connection c = connectionMaker.makeConnection();
        PreparedStatement ps = c.prepareStatement("select count(*) from users");

        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt(1);
    }


    public User findById(String id) throws SQLException {
        Connection c = connectionMaker.makeConnection();
        PreparedStatement ps = c.prepareStatement("select * from users where id = ?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        User user = null;
        if(rs.next()){
            user = new User(rs.getString(1), rs.getString(2), rs.getString(3));
        }

        rs.close();
        ps.close();
        c.close();
        if(user == null) throw new EmptyResultDataAccessException(1);
        return user;
    }
}
