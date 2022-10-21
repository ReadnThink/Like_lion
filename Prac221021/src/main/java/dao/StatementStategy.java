package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface StatementStategy {
    PreparedStatement makePreparedStatement(Connection c) throws SQLException;
}
