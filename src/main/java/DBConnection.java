import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection getConnection() {
        try {
            String jdbcURl = System.getenv("JDBC_URl"); //
            String user = System.getenv("USER"); //mini_dish_db_manager
            String password = System.getenv("PASSWORD"); //123456
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/mini_dish_db","mini_dish_db_manager","123456");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        try(Connection connection = dbConnection.getConnection()){
            if (connection != null){
                System.out.println("connecte");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
