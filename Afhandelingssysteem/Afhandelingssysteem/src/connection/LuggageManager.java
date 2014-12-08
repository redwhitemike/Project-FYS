/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Team 2
 */
public class LuggageManager extends QueryManager {
    
    public LuggageManager() {
        
    }
    
    /**
     * Adds luggage to the database.
     * @param FirstName
     * @param LastName
     * @param Address
     * @param ZipCode
     * @param City
     * @param Country 
     * @param PhoneNumber
     * @param eMail
     * @param FlightNumber
     * @param DepartedFrom
     * @param Destination
     * @param LabelNumber 
     * @param Colour
     * @param Weight
     * @param TypeLuggage
     * @param OtherThings
     */
    public void addLuggage(int labelNumber, int flightNumber, double weight, String color, int type, String description, int status) {
        String query = "INSERT INTO Luggage (label_number, flight_number, weight, color, type, description, status) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, labelNumber);
            statement.setInt(2, flightNumber);
            statement.setDouble(3, weight);
            statement.setString(4, color);
            statement.setInt(5, type);
            statement.setString(6, description);
            statement.setInt(7, status);

            statement.execute();
        } catch (SQLException e) {
            System.err.println("addLuggage:" + e);
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
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
