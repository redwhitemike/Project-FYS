/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import Main.Main;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.HashMap;

/**
 *
 * @author Youssri
 */
public class FlightManager extends QueryManager {
    /**
     * Gets the luggage that belongs to the customer
     * @param customerId
     * @return 
     */
    public ResultSet getCustomerLuggage(int customerId) {
        String query = "SELECT Luggage.* FROM Luggage INNER JOIN Flight ON Luggage.label_number = Flight.luggage_id INNER JOIN Customer ON Customer.customer_id = Flight.customer_id WHERE Customer.customer_id = ?";
        ResultSet flightData = null;
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, customerId);
            statement.execute();
            flightData = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return flightData;
    }
    
    public void editFlightData(int label, String flight, HashMap<String, Object> values) {
        String query = "UPDATE Flight SET flight_number = ?, departed_from = ?, lost_at = ?, destination = ? "
                + "WHERE luggage_id = ? AND flight_number = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, values.get("FlightNumber").toString());
            statement.setString(2, values.get("DepartedFrom").toString());
            statement.setString(3, values.get("LostAt").toString());
            statement.setString(4, values.get("Destination").toString());
            statement.setInt(5, label);
            statement.setString(6, flight);
            
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    /**
     * Returns the owner of the luggage based on the label
     * @param labelNumber
     * @return 
     */
    public int getOwnerByLabel(int labelNumber) {
        String query = "SELECT COUNT(*) as count, customer_id FROM Flight WHERE luggage_id = ?";
        ResultSet flightData = null;
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, labelNumber);
            statement.execute();
            flightData = statement.getResultSet();
            flightData.next();
            
            if (flightData.getInt("count") > 0) {
                return flightData.getInt("customer_id");
            } else {
                return -1;
            }
        } catch (SQLException e) {            
            Main.exceptionPrint(e);
        }
        
        return -1;
    }
    
    /**
     * Assigns a luggage to the customer.
     * @param customer
     * @param label 
     */
    public void giveOwner(int customer, int label) {
        String query = "UPDATE Flight SET customer_id = ? WHERE luggage_id = ?";
        ResultSet flightData = null;
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, customer);
            statement.setInt(2, label);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    /**
     * Registers a new flight. Use giveOwner() to assign it to a customer!
     * @param label
     * @param flightNumber
     * @param departed
     * @param lost
     * @param destination 
     */
    public void registerFlight(int label, String flightNumber, String departed, String lost, String destination) {
        String query = "INSERT INTO Flight (luggage_id, flight_number, departed_from, lost_at, destination) VALUES(?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, label);
            statement.setString(2, flightNumber);
            statement.setString(3, departed);
            statement.setString(4, lost);
            statement.setString(5, destination);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    /**
     * Returns flight data based on label number
     * @param labelNumber
     * @return 
     */
    public ResultSet getFlightData(int labelNumber) {
        String query = "SELECT * FROM Flight WHERE luggage_id = ?";
        ResultSet result;
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, labelNumber);
            statement.execute();
            
            result = statement.getResultSet();
            result.next();
            
            return result;
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return null;
    }
}
