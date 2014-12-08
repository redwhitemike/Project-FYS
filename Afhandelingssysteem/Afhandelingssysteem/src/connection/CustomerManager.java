/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class CustomerManager extends QueryManager {
    
    public CustomerManager() {
        
    }
    
    /**
     * Adds a customer to the database.
     * @param values
     */
    public void addCustomer(HashMap<String, Object> values) {

        try {
            String query = "INSERT INTO Customer (first_name, last_name, home_address, postcode, coutnry, city, phone_number, `e-mail`, flight_number, departed_from, lost_at, destination) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, values.get("FirstName").toString());
            statement.setString(2, values.get("LastName").toString());
            statement.setString(3, values.get("Address").toString());
            statement.setString(4, values.get("Zipcode").toString());
            statement.setString(5, values.get("Country").toString());
            statement.setString(6, values.get("City").toString());
            statement.setString(7, values.get("Phone").toString());
            statement.setString(8, values.get("Email").toString());
            statement.setInt(9, Integer.parseInt(values.get("Email").toString()));
            statement.setString(10, values.get("FlightNumber").toString());
            statement.setString(11, values.get("DepartedFrom").toString());
            statement.setString(12, values.get("LostAt").toString());
            statement.setString(13, values.get("Destination").toString());
            statement.execute();
        } catch (SQLException e) {
            Main.exceptionPrint(e);
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
     * Get all customers, filtering to a specific group.
     * @param filter
     * @return 
     */
    public ResultSet getCustomers(String filter) {
        String query = "SELECT * FROM Customer WHERE first_name LIKE ? OR last_name LIKE ? OR label_number = ?";
        ResultSet result = null;
        
        filter = "%" + filter + "%";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, filter);
            statement.setString(2, filter);
            statement.setInt(3, Integer.parseInt(filter));
            statement.execute();
            
            result = statement.getResultSet();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
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
