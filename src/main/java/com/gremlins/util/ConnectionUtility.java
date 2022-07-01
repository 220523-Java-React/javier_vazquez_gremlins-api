package com.gremlins.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {

    private static Connection connectionInstance;

    public static Connection getConnection() throws SQLException {

        if (connectionInstance == null || connectionInstance.isClosed()) {
            connectionInstance = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres?currentSchema=gremlin",
                    "postgres",
                    "gremlin123"
            );
        }

        return connectionInstance;
    };

};
