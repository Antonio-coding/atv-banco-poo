// file: exercisePraticoSingleton\Main.java

package exercisePraticoSingleton;

import exercisePraticoSingleton.DataAccess; // Assuming the package name is correct
import java.sql.SQLException;

public class Main {

  public static void main(String[] args) {
    try {
      DataAccess dataAccess = new DataAccess();
      dataAccess.retrieveData(); // Perform data retrieval operation
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        dataAccess.closeConnection(); // Close the connection
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
