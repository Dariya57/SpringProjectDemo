package data;

import java.sql.*;

public class PostgresDB {
    public Connection getConnection() {
        String connectionUrl = "jdbc:postgresql://localhost:5432/Kino"; // Database name
        try {
            // Loading the driver class into memory at runtime
            Class.forName("org.postgresql.Driver");

            // Establishing a connection
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "SMPstars457810nursem"); // Password

            return con;
        } catch (Exception e) {
            System.out.println("Failed to connect to Postgres: " + e.getMessage());
            return null;
        }
    }
}

