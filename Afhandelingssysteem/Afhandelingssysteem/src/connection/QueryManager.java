package connection;

import java.sql.*;

/**
 *
 * @author IS104_2
 */
public class QueryManager {
    DatabaseManager Database = new DatabaseManager();
    public Connection Connection;

    /**
     * makes a connection with the database
     */
    public QueryManager() {
        Connection = Database.getConnection();
    }
/**
 * searches for an username in the database
 * @param query
 * @return 
 */
    public ResultSet searchCustomer(String query) {
        ResultSet result = null;
        String sql = "SELECT * FROM Customer WHERE username LIKE ?";
        
        query = "%" + query + "%";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(sql);
            statement.setString(1, query);
            statement.execute();
            
            result = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println("searchCustomer: " + e);
        }
        
        return result;
    }
    
    /**
     * searches for a label number in the database
     * @param labelNumber
     * @return 
     */
    public ResultSet searchLuggage(int labelNumber) {
        ResultSet result = null;
        String sql = "SELECT * FROM Luggage WHERE label_number = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(sql);
            statement.setInt(1, labelNumber);
            statement.execute();
            
            result = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println("searchLuggage: " + e);
        }
        
        return result;        
    }
}

