package connection;

import Main.*;
import java.sql.*;
import javax.swing.JOptionPane;

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
            if (e.getClass().getName().equals("com.mysql.jdbc.exceptions.jdbc4.CommunicationsException")) {
                JOptionPane.showMessageDialog(null, "No database connection.");
                System.exit(0);
            }
            
            Main.exceptionPrint(e);
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
            Main.exceptionPrint(e);
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
            System.err.println("DatabaseManager.execute: " + e);
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
            Main.exceptionPrint(e);
        }
        
        return result;
    }
}
