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
public class EmployeeManager extends QueryManager {
    
    public EmployeeManager() {
        
    }
    
    /**
     * Adds a new employee to the database.
     * @param username
     * @param password
     * @param name
     * @param instertion
     * @param lastName
     * @param location
     * @param employeeNumber
     * @param function 
     */
    public void addEmployee(String username, String password, String name, String instertion, String lastName, 
                            String location, int employeeNumber, int function) {
        
        String query = "INSERT INTO User VALUES(null, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, name);
            statement.setString(4, instertion);
            statement.setString(5, lastName);
            statement.setString(6, location);
            statement.setInt(7, employeeNumber);
            statement.setInt(8, function);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    /**
     * Get employee from the database.
     * @param userid
     * @return 
     */
    public ResultSet getEmployee(int userid) {
        ResultSet result = null;
        String query = "SELECT * FROM User WHERE userid = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, userid);
            statement.execute();
            result = statement.getResultSet();
            result.next();
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
    
    /**
     * Get all employees.
     * @return 
     */
    public ResultSet getEmployees() {
        String query = "SELECT * FROM User";
        ResultSet result = Database.execute(query);
        return result;
    }
    
    /**
     * Deletes an employee from the database.
     * @param userid 
     */
    public void deleteEmployee(int userid) {
        String query = "DELETE FROM User WHERE userid = ?";
        
        try {
            PreparedStatement statement = Connection.prepareStatement(query);
            statement.setInt(1, userid);
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
