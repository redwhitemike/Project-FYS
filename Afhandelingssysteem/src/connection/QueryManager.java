package connection;

import java.sql.*;

/**
 *
 * @author Team 2
 */
public class QueryManager {
    DatabaseManager Database = new DatabaseManager();
    public Connection Connection;

    public QueryManager() {
        Connection = Database.getConnection();
    }

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
    
    public ResultSet searchLuggage(String query) {
        ResultSet result = null;
        String sql = "SELECT * FROM Luggage WHERE username LIKE ?";
        
        query = "%" + query + "%";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(sql);
            statement.setString(1, query);
            statement.execute();
            
            result = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println("searchLuggage: " + e);
        }
        
        return result;        
    }
}

