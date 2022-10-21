package dao;

import domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import javax.management.RuntimeOperationsException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    ConnectionMaker connectionMaker;

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void jdbcContextWithStatementStrategy(StatementStategy stmt){
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = connectionMaker.makeConnection();
            ps = stmt.makePreparedStatement(c);
            ps.executeUpdate();
        } catch (SQLException e) {

        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {

                }
            }
            if (c != null){
                try {
                    c.close();
                } catch (SQLException e) {

                }
            }
        }
    }
    public void deleteAll() throws SQLException {
        jdbcContextWithStatementStrategy(new DeleteAllStrategy());
    }
    public void add(User user) throws SQLException {
        AddStrategy addStrategy = new AddStrategy(user);
        jdbcContextWithStatementStrategy(addStrategy);
    }
    public int getCount() throws SQLException {

        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = connectionMaker.makeConnection();
            ps = c.prepareStatement("select count(*) from users");
            rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
           if(rs != null){
               try {
                   rs.close();
               } catch (SQLException e) {

               }
           }
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
    public User findById(String id) throws SQLException {
        Connection c = connectionMaker.makeConnection();
        PreparedStatement ps = c.prepareStatement("select * from users where id = ?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        User user = null;
        if(rs.next()){
            user = new User();
            user.setId(rs.getString(1));
            user.setName(rs.getString(2));
            user.setPassword(rs.getString(3));
        }

        rs.close();
        ps.close();
        c.close();

        if(user == null){
            throw new EmptyResultDataAccessException(1);
        }
        return user;
    }

}
