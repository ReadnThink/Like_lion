package dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnerctionMaker {
    public Connection MakeConnection() throws SQLException;
}
