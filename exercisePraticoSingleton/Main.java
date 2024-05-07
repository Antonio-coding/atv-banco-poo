// file: exercisePraticoSingleton\Main.java

package exercisePraticoSingleton;

import exercisePraticoSingleton.DataAccess;
import java.sql.SQLException;

public class Main {

  public static void main(String[] args) {
    try {
      DataAccess dataAccess = new DataAccess();
      dataAccess.retrieveData();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        dataAccess.closeConnection();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
