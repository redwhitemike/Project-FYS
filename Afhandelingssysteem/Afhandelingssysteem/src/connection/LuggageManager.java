package connection;

import Main.Main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;

/**
 *
 * @author Team 2
 */
public class LuggageManager extends QueryManager {
    
    public LuggageManager() {
        
    }
    
    /**
     * Adds luggage to the database.
     * @param values
     */
    public void addLuggage(HashMap<String, Object> values) {
        String query = "INSERT INTO Luggage (label_number, flight_number, weight, color, type, description, status) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(values.get("LabelNumber").toString()));
            statement.setString(2, values.get("FlightNumber").toString());
            statement.setDouble(3, Double.parseDouble(values.get("Weight").toString()));
            statement.setString(4, values.get("Colour").toString());
            statement.setInt(5, Integer.parseInt(values.get("Type").toString()));
            statement.setString(6, values.get("Description").toString());
            statement.setInt(7, Integer.parseInt(values.get("Status").toString()));

            statement.execute();
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
    }
    
    /**
     * Get luggage from the database.
     * @param labelNumber
     * @return 
     */
    public ResultSet getLuggage(int labelNumber) {
        ResultSet result = null;
        String query = "SELECT * FROM Luggage WHERE label_number = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, labelNumber);
            statement.execute();
            result = statement.getResultSet();
            result.next();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
    
    /**
     * Get all luggage.
     * @return 
     */
    public ResultSet getLuggages() {
        String query = "SELECT * FROM Luggage";
        ResultSet result = Database.execute(query);
        return result;
    }
    
    public ResultSet getLuggages(String filter) {
        String query = "SELECT * FROM Luggage WHERE label_number = ? OR flight_number = ? OR status = ?";
        ResultSet result = null;
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(filter));
            statement.setInt(2, Integer.parseInt(filter));
            statement.setInt(3, Integer.parseInt(filter));
            statement.execute();
            
            result = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
    
    /**
     * Updates the status of the luggage.
     * @param labelNumber
     * @param newStatus 
     */
    public void setStatus(int labelNumber, int newStatus) {
        String query = "UPDATE Luggage SET status = ? WHERE label_number = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, newStatus);
            statement.setInt(2, labelNumber);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
