package com.Restaurant.Entity;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getDBConnection() {
            Connection connection = null;

            try {
                Dotenv dotenv=Dotenv.load();
                String url = dotenv.get("URL");
                String user = dotenv.get("USERNAME");
                String password = dotenv.get("PASSWORD");

                connection = DriverManager.getConnection(url, user, password);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return connection;
    }
}
