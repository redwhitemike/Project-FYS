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
public class CustomerManager extends QueryManager {
    
    public CustomerManager() {
        
    }
    
    /**
     * Adds a customer to the database.
     * @param firstName
     * @param lastName
     * @param address
     * @param zipcode
     * @param city
     * @param country
     * @param phone
     * @param email
     * @param flightNumber
     * @param departedFrom
     * @param destination 
     */
    public void addCustomer(String firstName, String lastName, String address, String zipcode, String city, 
                            String country, String phone, String email, int flightNumber, String departedFrom, String destination) {
        try {
            String query = "INSERT INTO Customer (first_name, last_name, home_address, postcode, coutnry, city, phone_number, `e-mail`, flight_number, departed_from, destination) "
                    + "VALUES(null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, address);
            statement.setString(4, zipcode);
            statement.setString(5, country);
            statement.setString(6, city);
            statement.setString(7, phone);
            statement.setString(8, email);
            statement.setInt(9, flightNumber);
            statement.setString(10, departedFrom);
            statement.setString(11, destination);
            statement.execute();
        } catch (SQLException e) {
            System.err.println("addCustomer: " + e);
        }
    }
    
    public void editCustomer(int customerId, String firstName, String lastName, String address, String zipcode, String city, 
                            String country, String phone, String email) {
        try {
            String query = "";
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, address);
            statement.setString(4, zipcode);
            statement.setString(5, city);
            statement.setString(6, country);
            statement.setString(7, phone);
            statement.setString(8, email);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }        
    }
    
    /**
     * Get customer from the database.
     * @param customerid
     * @return 
     */
    public ResultSet getCustomer(int customerid) {
        ResultSet result = null;
        String query = "SELECT * FROM Customer WHERE customerid = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, customerid);
            statement.execute();
            result = statement.getResultSet();
            result.next();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
    
    /**
     * Get all customers.
     * @return 
     */
    public ResultSet getCustomers() {
        String query = "SELECT * FROM Customer";
        ResultSet result = Database.execute(query);
        return result;
    }
    
    /**
     * Deletes a customer from the database.
     * @param customerid 
     */
    public void deleteCustomer(int customerid) {
        String query = "DELETE FROM Customer WHERE customerid = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, customerid);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
}
