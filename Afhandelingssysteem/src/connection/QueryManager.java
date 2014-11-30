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
    
    public ResultSet searchIn(String table, String column, String query) {
        ResultSet result = null;
        String sql = "SELECT * FROM " + table + " WHERE " + column + " LIKE ?";
        
        query = "%" + query + "%";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(sql);
            statement.setString(1, query);
            statement.execute();
            
            result = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
}

