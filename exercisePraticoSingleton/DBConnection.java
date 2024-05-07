package exercisePraticoSingleton;

import java.sql.*;

public class DBConnection {

  private DBConnection() throws SQLException {
    String url = "jdbc:postgresql://silly.db.elephantsql.com/gybbunxv";
    String user = "gybbunxv";
    String password = "BV6Yv-2zLXg1-wU7VrUP_vIY9TXOqhVS";
    connection = DriverManager.getConnection(url, user, password);
  }

  private static volatile DBConnection instance;

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

  private Connection connection;

  public Connection getConnection() throws SQLException {
    if (connection.isClosed()) {
      throw new SQLException("Conexão fechada. Re estabelaça a conexão.");
    }
    return connection;
  }

  public void closeConnection() throws SQLException {
    if (connection != null && !connection.isClosed()) {
      connection.close();
    }
  }
}
