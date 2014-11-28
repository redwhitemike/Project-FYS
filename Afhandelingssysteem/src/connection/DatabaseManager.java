package connection;

import java.sql.*;

/**
 *
 * @author Team 2
 */
public class DatabaseManager {
    private Connection Connection;
    
    /**
     * Opens a new connection to the database
     * @return 
     */
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String link = "jdbc:mysql://localhost:3306/afhandelingssysteem";
            String user = "root";
            String pass = "";

            Connection = DriverManager.getConnection(link, user, pass);
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e);
        }
        
        return Connection;
    }
    
    /**
     * Closes the connection to the database.
     */
    public void closeConnection() {
        try {
            Connection.close();
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
    /**
     * Executes a query and returns a result.
     * - NOT protected against SQL injections -
     * @param sql
     * @return 
     */
    public ResultSet execute(String sql) {
        ResultSet result = null;
        
        try {
            Statement statement = Connection.createStatement();
            result = statement.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
    
    /**
     * Inserts a new record into the database.
     * @param sql
     * @return 
     */
    public ResultSet insert(String sql) {
        ResultSet result = null;
        
        try {
            Statement statement = Connection.createStatement();
            statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            result = statement.getGeneratedKeys();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
}
