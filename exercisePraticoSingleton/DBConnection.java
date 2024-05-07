package exercisePraticoSingleton;

import java.sql.*;

public class DBConnection {

  // Private constructor to prevent direct instantiation
  private DBConnection() throws SQLException {
    // Database connection initialization logic goes here
    String url = "jdbc:postgresql://silly.db.elephantsql.com/gybbunxv";
    String user = "gybbunxv";
    String password = "BV6Yv-2zLXg1-wU7VrUP_vIY9TXOqhVS";
    connection = DriverManager.getConnection(url, user, password);
  }

  // Thread-safe instance holder using volatile (double-checked locking for efficiency)
  private static volatile DBConnection instance;

  // Public getInstance() method with proper synchronization for thread safety
  public static DBConnection getInstance() throws SQLException {
    if (instance == null) {
      synchronized (DBConnection.class) {
        if (instance == null) {
          instance = new DBConnection();
        }
      }
    }
    return instance;
  }

  // Instance variable for the connection
  private Connection connection;

  // Public method to get the connection (consider error handling)
  public Connection getConnection() throws SQLException {
    // Check if connection is still valid before returning (optional)
    if (connection.isClosed()) {
      throw new SQLException("Connection is closed. Re-establish connection.");
    }
    return connection;
  }

  // Close the connection (optional, consider using a connection pool)
  public void closeConnection() throws SQLException {
    if (connection != null && !connection.isClosed()) {
      connection.close();
    }
  }
}
