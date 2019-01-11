package creationaldesignpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Lazy Instantiation
public class SingletonPatternLazy {
    private static volatile SingletonPatternLazy instance = null;
    private static volatile Connection conn = null;

    private SingletonPatternLazy() {

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (conn != null) {
            throw new RuntimeException("Use getConnection method to connect to Apache Derby Database");
        }

        if (instance != null)
            throw new RuntimeException("use getInstance method to create new instance");
    }

    public static SingletonPatternLazy getInstance() {
        if (instance == null) {
            synchronized (SingletonPatternLazy.class) {
                if (instance == null) {
                    instance = new SingletonPatternLazy();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (conn == null) {
            synchronized (SingletonPatternLazy.class) {
                if (conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:D:/projects/codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}