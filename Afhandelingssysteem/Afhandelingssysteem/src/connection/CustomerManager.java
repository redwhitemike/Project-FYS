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
 * @author IS104_2
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
            String query = 
                    "INSERT INTO Customer (first_name, last_name, home_address, stay_address, zipcode, city, country, phone_number, `e-mail`) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, values.get("FirstName").toString());
            statement.setString(2, values.get("LastName").toString());
            statement.setString(3, values.get("HomeAddress").toString());
            statement.setString(4, values.get("StayAddress").toString());
            statement.setString(5, values.get("Zipcode").toString());
            statement.setString(6, values.get("City").toString());
            statement.setString(7, values.get("Country").toString());
            statement.setString(8, values.get("Phone").toString());
            statement.setString(9, values.get("Email").toString());
            statement.execute();
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }
    }
    
    /**
     * this method edits the customer in the database
     * @param customerId
     * @param values 
     */
    public void editCustomer(int customerId, HashMap<String, Object> values) {
        try {
            String query = 
                    "UPDATE Customer SET first_name = ?, last_name = ?, home_address = ?, stay_address = ?, zipcode = ?, city = ?, country = ?, phone_number = ?, `e-mail` = ? "
                    + "WHERE customer_id = ?";
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, values.get("FirstName").toString());
            statement.setString(2, values.get("LastName").toString());
            statement.setString(3, values.get("HomeAddress").toString());
            statement.setString(4, values.get("StayAddress").toString());
            statement.setString(5, values.get("Zipcode").toString());
            statement.setString(6, values.get("City").toString());
            statement.setString(7, values.get("Country").toString());
            statement.setString(8, values.get("Phone").toString());
            statement.setString(9, values.get("Email").toString());
            statement.setInt(10, customerId);
            statement.execute();
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }       
    }
    
    /**
     * Get customer from the database.
     * @param customerid
     * @return 
     */
    public ResultSet getCustomer(int customerid) {
        ResultSet result = null;
        String query = "SELECT * FROM Customer WHERE customer_id = ?";
        
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
        String query = "SELECT * FROM Customer WHERE first_name LIKE ? OR last_name LIKE ?";
        ResultSet result = null;
        
        filter = "%" + filter + "%";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, filter);
            statement.setString(2, filter);
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
        String query = "DELETE FROM Customer WHERE customer_id = ?";
        String queryFlight = "DELETE FROM Flight WHERE customer_id = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, customerid);
            statement.execute();
            
            statement = Connection.prepareStatement(queryFlight);
            statement.setInt(1, customerid);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    /**
     * finds the customer ID
     * @param id
     * @return 
     */
    public boolean findId(int id) {
         String query = "SELECT COUNT(*) as count FROM Customer WHERE customer_id = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.execute();
            
            ResultSet result = statement.getResultSet();
            result.next();
            
            return result.getInt("count") > 0;
        } catch (SQLException e) {
            Main.exceptionPrint(e);
        }       
        
        return false;
    }
    
}
