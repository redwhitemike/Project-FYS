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
    public void addLuggage(String FirstName,
                String LastName,String Address,String ZipCode,
                String City,String Country,String PhoneNumber,
                String eMail,String FlightNumber,String DepartedFrom,
                String Destination,String LabelNumber,String Colour,
                String Weight,String TypeLuggage,String OtherThings) {
        String query = "INSERT INTO Luggage VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, FirstName);
            statement.setString(2, LastName);
            statement.setString(3, Address);
            statement.setString(4, ZipCode);
            statement.setString(5, City);
            statement.setString(6, Country);
            statement.setString(7, PhoneNumber);
            statement.setString(8, eMail);
            statement.setString(9, FlightNumber);
            statement.setString(10, DepartedFrom);
            statement.setString(11, Destination);
            statement.setString(12, LabelNumber);
            statement.setString(13, Colour);
            statement.setString(14, Weight);
            statement.setString(15, TypeLuggage);
            statement.setString(16, OtherThings);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
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
