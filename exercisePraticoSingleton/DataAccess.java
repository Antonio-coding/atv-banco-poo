// file: exercisePraticoSingleton\DataAccess.java

package exercisePraticoSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccess {

  private Connection connection;

  public DataAccess() throws SQLException {
    DBConnection dbConnection = DBConnection.getInstance();
    connection = dbConnection.getConnection();
  }

  public void retrieveData() throws SQLException {
    Statement statement = connection.createStatement();
    String query = "SELECT * FROM nome_da_tabela";
    ResultSet resultSet = statement.executeQuery(query);

    while (resultSet.next()) {
      int id = resultSet.getInt("id");
      String name = resultSet.getString("name");

      System.out.println("Retrieved Data: ID = " + id + ", Name = " + name);
    }

    resultSet.close();
    statement.close();
  }

  public void closeConnection() throws SQLException {
    if (connection != null && !connection.isClosed()) {
      connection.close();
    }
  }
}
