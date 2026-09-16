package db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    private static Properties loadProperties() {

        try (InputStream is = DB.class.getClassLoader()
                .getResourceAsStream("db.properties")) {

            if (is == null) {
                throw new DbException("Arquivo db.properties não encontrado");
            }

            Properties props = new Properties();
            props.load(is);

            return props;

        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static Connection getConnection() {

        Properties props = loadProperties();

        String url = props.getProperty("dburl");
        String username = props.getProperty("user");
        String password = props.getProperty("password");

        try {
            return DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }
}